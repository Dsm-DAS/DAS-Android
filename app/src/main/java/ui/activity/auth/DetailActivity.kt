package ui.activity.auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import base.BaseActivity
import com.example.das_android.R
import com.example.das_android.databinding.ActivityDetailBinding
import com.example.das_android.databinding.ActivityLoginBinding
import ui.activity.MainActivity
import ui.fragment.WriteFragment
import util.startIntent
import util.startIntentClearTop

class DetailActivity : BaseActivity<ActivityDetailBinding>(R.layout.activity_detail) {
    override fun initView(){
        binding.btn.setOnClickListener {
        startIntent(this,MainActivity::class.java)}
    }

    override fun observeEvent() {

    }
}