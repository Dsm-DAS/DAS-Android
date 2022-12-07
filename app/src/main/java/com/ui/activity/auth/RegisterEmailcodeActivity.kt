package com.ui.activity.auth

import android.content.Intent
import androidx.lifecycle.ViewModelProvider
import com.base.BaseActivity
import com.example.das_android.R
import com.example.das_android.databinding.ActivityRegisterEmailcodeBinding
import com.data.api.user.register.RegisterRepository
import com.viewmodel.Register.RegisterViewModel
import com.viewmodel.Register.RegisterViewModelFactory

class RegisterEmailcodeActivity : BaseActivity<ActivityRegisterEmailcodeBinding>(
    R.layout.activity_register_emailcode
){

    private val registerRepository: RegisterRepository by lazy {
        RegisterRepository()
    }

    private val registerViewModel: RegisterViewModel by lazy {
        ViewModelProvider(
            this, RegisterViewModelFactory(registerRepository)
        )[RegisterViewModel::class.java]
    }


    override fun initView() {
        initNextCode()
    }


    private fun initNextCode() {

        binding.btnRegisterNext.setOnClickListener {
            val email: String = binding.etRegisterEmail.text.toString()
            if (email.isNotBlank()){
                registerViewModel.emailcode(email)

            }
            binding.btnRegisterNext.isEnabled = false
        }

    }

    override fun observeEvent() {
        registerViewModel.emailcodeResponse.observe(
            this
        ){


            when(it.code()){

                201 -> {
                    val email: String = binding.etRegisterEmail.text.toString()
                    val intent = Intent(this, RegisterCertifiedNumberActivity::class.java)
                    intent.putExtra("email",email)
                    startActivity(intent)
                    finish()
                }
                400 -> showShortToast("이메일 형식이 잘 못 되었습니다.")

                409 -> showShortToast("중복된 이메일입니다.")
            }
        }
    }
}

