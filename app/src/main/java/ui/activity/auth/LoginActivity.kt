package ui.activity.auth

import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import base.BaseActivity
import com.example.das_android.R
import com.example.das_android.databinding.ActivityLoginBinding
import data.dto.user.login.LoginRequest
import ui.activity.MainActivity
import util.access_token
import util.startIntent
import util.startIntentClearTop
import viewmodel.Login.LoginViewModel

class LoginActivity :BaseActivity<ActivityLoginBinding>(
    R.layout.activity_login
){
    private val viewModel by lazy {
        ViewModelProvider(this)[LoginViewModel::class.java]
    }


    private fun initGoRegisterEmail() {
        binding.signupButton.setOnClickListener {
            startIntent(this,RegisterEmailcodeActivity::class.java)
        }
    }

    private fun initLoginButton() {
        binding.loginButton.setOnClickListener{
            val id = binding.etLoginId.text.toString()
            val password = binding.etLoginPassword.text.toString()

            if (id == "" || password == ""){

            } else {
                val loginrequest = LoginRequest(id,password)
                viewModel.postLogin(loginrequest)
                Toast.makeText(this,"a",Toast.LENGTH_LONG).show()
            }
        }
    }

    override fun initView() {
        initLoginButton()
        initGoRegisterEmail()
    }

    override fun observeEvent() {
        viewModel.run {
            success.observe(this@LoginActivity){
                it.run {
                    Toast.makeText(baseContext, access_token ,Toast.LENGTH_SHORT).show()
                    startIntentClearTop(baseContext,MainActivity::class.java)
                }
            }
            failure.observe(this@LoginActivity){
                it.run {
                    Toast.makeText(baseContext,"실패",Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

}





