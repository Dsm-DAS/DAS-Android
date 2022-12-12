package ui.activity.auth

import androidx.lifecycle.ViewModelProvider
import base.BaseActivity
import com.example.das_android.R
import com.example.das_android.databinding.ActivityLoginBinding
import data.api.user.login.LoginRepository
import ui.activity.MainActivity
import util.startIntentClearTop
import viewmodel.Login.LoginViewModel
import viewmodel.Login.LoginViewModelFactory

class LoginActivity :BaseActivity<ActivityLoginBinding>(
    R.layout.activity_login
){

    private val loginRepository : LoginRepository by lazy {
        LoginRepository()
    }

    private val loginViewModel : LoginViewModel by lazy {
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

            if (email.isNotBlank() && passowrd.isNotBlank()){
                loginViewModel.postLogin(email,passowrd)
            }
        }
    }

    private fun initGoRegister() {
        binding.signupButton.setOnClickListener {
            startIntentClearTop(this,RegisterEmailcodeActivity::class.java)
        }
    }

    override fun observeEvent() {
        loginViewModel.loginResponse.observe(
            this
        ){
            when(it.code()){
                200 -> {
                    showShortToast("성공")
                    startIntentClearTop(this,MainActivity::class.java)
                } 400->{
                    showShortToast("이게뭐람;;")
                }
            }
        }
    }

}





