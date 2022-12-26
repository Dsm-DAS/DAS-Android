package ui.activity.auth

import android.os.CountDownTimer
import androidx.lifecycle.ViewModelProvider
import base.BaseActivity
import com.example.das_android.R
import com.example.das_android.databinding.ActivityRegisterCertifiednumberBinding
import data.api.user.register.RegisterRepository
import util.startIntent
import viewModel.Register.RegisterViewModel
import viewModel.Register.RegisterViewModelFactory

class RegisterCertifiedNumberActivity : BaseActivity<ActivityRegisterCertifiednumberBinding>(
    R.layout.activity_register_certifiednumber
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

        initNextPassword()
        initCountDown()

    }

    private fun initCountDown() {
        object : CountDownTimer(300000, 1000) {

            override fun onTick(p0: Long) {

                val min = (((p0 / (1000 * 60)).toString()))
                val sec = (p0 % 60000 / 1000).toString()
                binding.tvRegisterEmailTimer.text = "$min:$sec"
            }
            override fun onFinish() {

                showShortToast("인증코드가 만료되었습니다.")
                backEmailcode()

            }
        }.start()
    }

    fun backEmailcode() {
        startIntent(this, RegisterEmailcodeActivity::class.java)
        finish()
    }

    private fun initNextPassword() {
        binding.btnRegisterNext.setOnClickListener {
            val email = intent.getStringExtra("email")
            val code: String = binding.etRegisterEmailNumber.text.toString()
            if (email!!.isNotBlank() && code.isNotBlank()) {
                registerViewModel.certifiedNumber(email, code)
            }

        }
    }

    override fun observeEvent() {
        registerViewModel.certifiednumberResponse.observe(
            this
        ) {
            when (it.code()) {

                200 -> {
                    RegisterViewModel.email =   intent.getStringExtra("email")
                    startIntent(this@RegisterCertifiedNumberActivity, RegisterPasswordActivity::class.java)
                    finish()
                }
                400 -> showShortToast("요청 형식을 식별할 수 없습니다.")

                401 -> showShortToast("올바른 인증코드를 입력하세요.")

            }
        }
    }
}