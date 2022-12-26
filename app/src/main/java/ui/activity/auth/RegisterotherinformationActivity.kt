package ui.activity.auth

import android.widget.NumberPicker
import androidx.lifecycle.ViewModelProvider
import base.BaseActivity
import com.example.das_android.R
import com.example.das_android.databinding.ActivityRegisterOtherInformationBinding
import data.api.user.register.RegisterRepository
import util.startIntent
import viewModel.Register.RegisterViewModel
import viewModel.Register.RegisterViewModel.Companion.email
import viewModel.Register.RegisterViewModelFactory

class RegisterotherinformationActivity : BaseActivity<ActivityRegisterOtherInformationBinding> (
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
        initClassPicker()
        initNumberPicker()
    }



    private fun initGradePicker() {
        val grPicker: NumberPicker = binding.npGrade
        grPicker.maxValue = 3
        grPicker.minValue = 1
        grPicker.value = 1
        grPicker.wrapSelectorWheel = false
    }


    private fun initClassPicker() {
        val classPicker: NumberPicker = binding.npClass
        classPicker.maxValue = 4
        classPicker.minValue = 1
        classPicker.value = 1
        classPicker.wrapSelectorWheel = false
    }

    private fun initNumberPicker() {
        val numberPicker: NumberPicker = binding.npNumber
        numberPicker.maxValue = 20
        numberPicker.minValue = 1
        numberPicker.value = 1
        numberPicker.wrapSelectorWheel = false
    }



    private fun initRegister() {
        binding.btnRegisterNext.setOnClickListener {
            val password = intent.getStringExtra("password")
            val name: String = binding.etRegisterName.text.toString()
            val grPicker: Int = binding.npGrade.value
            val classPicker: Int = binding.npClass.value
            val numberPicker: Int = binding.npNumber.value
            var sex: String = ""

            when(binding.rgRegisterSex.checkedRadioButtonId){

                R.id.rbtn_register_man -> sex = "MALE"
                    .also {
                    println()
                }
                R.id.rbtn_register_woman -> sex = "FEMALE"
            }

            registerViewModel.register(
                email.toString(),
                password.toString(),
                name,
                grPicker,
                classPicker,
                numberPicker,
                sex.toString(),

            )

        }
    }

    override fun observeEvent() {
        registerViewModel.registerResponse.observe(
            this
        ) {
            when (it.code()) {

                201 -> {
                    startIntent(this, LoginActivity::class.java)
                    finish()
                }

                400 -> showShortToast("올바른 형식을 입력하세요.")

                401 -> showShortToast("인증되지 않은 이메일입니다.")

                409 -> showShortToast("중복된 이메일입니다.")


            }
        }
    }
}




