package ui.activity.auth

import android.content.Intent
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import base.BaseActivity
import com.example.das_android.R
import com.example.das_android.databinding.ActivityRegisterPasswordBinding
import data.api.user.register.RegisterRepository
import viewmodel.Register.RegisterViewModel
import viewmodel.Register.RegisterViewModelFactroy

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
                val intent = Intent(this,RegisterotherinformationActivity::class.java)
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