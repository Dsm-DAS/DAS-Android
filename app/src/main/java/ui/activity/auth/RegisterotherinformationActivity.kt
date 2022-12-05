package ui.activity.auth

import android.os.Bundle
import android.os.CountDownTimer
import android.widget.NumberPicker
import androidx.appcompat.app.AppCompatActivity
import base.BaseActivity
import com.example.das_android.R
import com.example.das_android.databinding.ActivityRegisterOtherInformationBinding

class RegisterotherinformationActivity : BaseActivity<ActivityRegisterOtherInformationBinding> (
    R.layout.activity_register_other_information
) {


    override fun initView() {
        initRegister()
        initGradePicker()
    }

    private fun initGradePicker(){
        val grPicker: NumberPicker = binding.npGrade
        grPicker.maxValue = 3
        grPicker.minValue = 1
        grPicker.value = 1
        grPicker.setOnLongPressUpdateInterval(100)
        grPicker.wrapSelectorWheel = true

    }

    private fun initRegister(){
        binding.btnRegisterNext.setOnClickListener{
            val email = intent.getStringExtra("email")
            val password = intent.getStringExtra("password")
            val name: String = binding.etRegisterName.text.toString()

        }
    }

    override fun observeEvent() {
       // TODO("Not yet implemented")
    }


}


