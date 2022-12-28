package ui.activity.auth

import base.BaseActivity
import com.example.das_android.R
import com.example.das_android.databinding.ActivityRecruitmentDetailBinding
import ui.activity.MainActivity
import util.startIntentClearTop

class RecruitmentDetailActivity : BaseActivity<ActivityRecruitmentDetailBinding>(R.layout.activity_recruitment_detail){
    override fun initView() {
        binding.btn.setOnClickListener {
            startIntentClearTop(this,MainActivity::class.java)
        }

    }

    override fun observeEvent() {

    }

}