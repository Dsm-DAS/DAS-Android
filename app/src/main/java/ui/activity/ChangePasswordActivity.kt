package ui.activity

import android.content.Intent
import base.BaseActivity
import com.example.das_android.R
import com.example.das_android.databinding.ActivityChangepasswordBinding
import ui.activity.authpackage.LoginActivity

class ChangePasswordActivity: BaseActivity<ActivityChangepasswordBinding>(R.layout.activity_changepassword) {

    override fun initView() {
        initGoLogin()
    }

    private fun initGoLogin(){

        binding.btnRegisterNext.setOnClickListener {
            val intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
            showShortToast("비밀번호가 변경되었습니다.")
        }
    }

    override fun observeEvent() {
        //TODO("Not yet implemented")
    }
}