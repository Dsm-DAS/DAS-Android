package ui.activity.authpackage

import androidx.lifecycle.ViewModelProvider
import base.BaseActivity
import com.example.das_android.R
import com.example.das_android.databinding.ActivityLoginBinding
import data.api.user.login.LoginRepository
import ui.activity.MainActivity
import ui.activity.auth.RegisterEmailcodeActivity
import util.startIntent
import util.startIntentClearTop
import viewModel.Login.LoginViewModel
import viewModel.Login.LoginViewModelFactory

class LoginActivity :BaseActivity<ActivityLoginBinding>(
    R.layout.activity_login
) {

    private val loginRepository: LoginRepository by lazy {
        LoginRepository()
    }

    private val loginViewModel: LoginViewModel by lazy {
        ViewModelProvider(this, LoginViewModelFactory(loginRepository))[LoginViewModel::class.java]
    }

    override fun initView() {
        initLoginButton()
        initGoRegister()
    }

    private fun initLoginButton() {
        binding.loginButton.setOnClickListener {
            val email = binding.etLoginEmail.text.toString()
            val passowrd = binding.etLoginPassword.text.toString()

            if (email.isNotBlank() && passowrd.isNotBlank()) {
                loginViewModel.postLogin(email, passowrd)
            }
        }
    }

    private fun initGoRegister() {
        binding.signupButton.setOnClickListener {
            startIntentClearTop(this, RegisterEmailcodeActivity::class.java)
        }
    }

    override fun observeEvent() {
        loginViewModel.loginResponse.observe(
            this
        ) {
            when (it.code()) {
                200 -> {
                    showShortToast("로그인이 되었습니다.")
                    startIntentClearTop(this, MainActivity::class.java)
                }
                400 -> showShortToast("요청 형식을 식별할 수 없습니다.")

                401 -> showShortToast("비밀번호가 일치하지 않습니다.")

                404 -> showShortToast("요청 대상을 찾을 수 없습니다.")
            }
        }
    }
}











