package ui.activity

import base.BaseActivity
import com.example.das_android.R
import com.example.das_android.databinding.ActivityMenuProfileBinding
import util.startIntent
import util.startIntentClearTop

class MenuProfileActivity: BaseActivity<ActivityMenuProfileBinding>(R.layout.activity_menu_profile) {



    override fun initView() {
        binding.imageView6.setOnClickListener {
            startIntentClearTop(this,MainActivity::class.java)
        }
    }

    override fun observeEvent() {

    }
}