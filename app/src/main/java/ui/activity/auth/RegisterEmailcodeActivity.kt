package ui.activity.auth

import base.BaseActivity
import com.example.das_android.R
import com.example.das_android.databinding.ActivityRegisterEmailcodeBinding

class RegisterEmailcodeActivity : BaseActivity<ActivityRegisterEmailcodeBinding>(
    R.layout.activity_register_emailcode
){
    override fun initView() {
        email()
    }

    override fun observeEvent() {

    }

    private fun email(){
    }


}