package com.ui.activity.auth

import android.os.Bundle
import android.os.CountDownTimer
import android.widget.NumberPicker
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.base.BaseActivity
import com.example.das_android.R
import com.example.das_android.databinding.ActivityRegisterOtherInformationBinding
import com.data.api.user.register.RegisterRepository
import com.ui.activity.MainActivity
import com.util.startIntent
import com.viewmodel.Register.RegisterViewModel
import com.viewmodel.Register.RegisterViewModelFactory

class RegisterotherinformationActivity : BaseActivity<ActivityRegisterOtherInformationBinding>(
    R.layout.activity_register_other_information
) {

    private val registerRepository: RegisterRepository by lazy {
        RegisterRepository()
    }

    private val registerViewModel: RegisterViewModel by lazy {
        ViewModelProvider(
            this, RegisterViewModelFactory(registerRepository)
        )[RegisterViewModel::class.java]
    }

    override fun initView() {
        initRegister()
        initGradePicker()
        initClassNumPicker()
        initNumberPicker()
    }

    private fun initGradePicker() {
        val grPicker: NumberPicker = binding.npGrade
        grPicker.maxValue = 3
        grPicker.minValue = 1
        grPicker.value = 1
        grPicker.setOnLongPressUpdateInterval(200)
        grPicker.wrapSelectorWheel = false

    }

    private fun initClassNumPicker() {
        val classNumber: NumberPicker = binding.npClass
        classNumber.maxValue = 4
        classNumber.minValue = 1
        classNumber.value = 1
        classNumber.setOnLongPressUpdateInterval(200)
        classNumber.wrapSelectorWheel = false

    }

    private fun initNumberPicker(){

        val numberPicker: NumberPicker = binding.npNumber
        numberPicker.maxValue = 20
        numberPicker.minValue = 1
        numberPicker.value = 1
        numberPicker.setOnLongPressUpdateInterval(100)
        numberPicker.wrapSelectorWheel = false
    }



    private fun initRegister(){
        binding.btnRegisterNext.setOnClickListener{
            val email = intent.getStringExtra("email")
            val password = intent.getStringExtra("password")
            val name: String = binding.etRegisterName.text.toString()

        }
    }

    override fun observeEvent() {
        registerViewModel.registerResponse.observe(
            this
        ){
            when(it.code()){

                201 -> {
                    startIntent(this, MainActivity::class.java)
                    finish()
                }

                400 -> showShortToast("모든 형식을 작성해주세요.")

                401 -> showShortToast("인증되지 않은 이메일입니다.")

                409 -> showShortToast("중복된 이메일입니다.")
            }
        }

    }


}


