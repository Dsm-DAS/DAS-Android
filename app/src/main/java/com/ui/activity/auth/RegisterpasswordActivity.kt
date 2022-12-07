package com.ui.activity.auth

import android.content.Intent
import com.base.BaseActivity
import com.example.das_android.R
import com.example.das_android.databinding.ActivityRegisterPasswordBinding

class RegisterpasswordActivity : BaseActivity<ActivityRegisterPasswordBinding>(
    R.layout.activity_register_password
) {


    override fun initView() {
        initNextRegister()
    }

    private fun initNextRegister(){
        binding.btnRegisterNext.setOnClickListener{
            val password = binding.etRegisterPassword.text.toString()
            if (password.isNotBlank()){
                val intent = Intent(this, RegisterotherinformationActivity::class.java)
                intent.putExtra("password",password)
                startActivity(intent)
                finish()
            }
        }
    }

    override fun observeEvent() {
        //TODO("Not yet implemented")
    }

}