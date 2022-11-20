package ui.activity.auth

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import base.BaseActivity
import com.example.das_android.R
import com.example.das_android.databinding.ActivityRegisterCertifiedNumberBinding
import data.api.user.register.RegisterRepository
import viewmodel.Register.CertifiedNumber.CertifiedNumberViewModel
import viewmodel.Register.CertifiedNumber.CertifiedNumberViewModelFactory

class RegisterCertifiedNumberActivity : BaseActivity<ActivityRegisterCertifiedNumberBinding>(
    R.layout.activity_register_certified_number
){


    private val viewModel: ViewModel by lazy {
        ViewModelProvider(
            this, CertifiedNumberViewModelFactory(RegisterRepository())
        )[CertifiedNumberViewModel::class.java]

    }




    override fun initView() {


    }

    override fun observeEvent() {
    }


}
