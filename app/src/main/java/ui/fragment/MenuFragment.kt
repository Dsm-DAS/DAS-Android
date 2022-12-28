package ui.fragment

import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import base.BaseFragment
import com.example.das_android.R
import com.example.das_android.databinding.ActivittyMenuBinding
import ui.activity.ChangePasswordActivity
import ui.activity.LikeDetailActivitiy
import ui.activity.MenuProfileActivity
import ui.activity.authpackage.LoginActivity
import util.startIntentClearTop

class MenuFragment : BaseFragment<ActivittyMenuBinding>(R.layout.activitty_menu) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val intent = Intent(requireActivity(),MenuProfileActivity::class.java)

        binding.btnNextProfile.setOnClickListener{
            startActivity(intent)
        }

        initLogout()

        initChangePassword()
    }


    private fun initChangePassword(){
        binding.tvChangePassword.setOnClickListener {
            startIntentClearTop(requireActivity(), ChangePasswordActivity::class.java)
        }
    }

    private fun initLogout(){
        binding.imageView4.setOnClickListener {
            binding.constraintLayout2.visibility = View.VISIBLE
        }

        binding.tvLogout.setOnClickListener {
            val intent = Intent(requireActivity(), LoginActivity::class.java)
            val builder = AlertDialog.Builder(context)

            builder.setTitle("로그아웃")
            builder.setMessage("로그아웃을 하시겠습니까?")


            fun go(){
                Toast.makeText(context, "로그아웃 되었습니다.", Toast.LENGTH_SHORT).show()
                val intent = Intent(context, LoginActivity::class.java)
                startActivity(intent)
            }
            var dialog_listener = object : DialogInterface.OnClickListener{
                override fun onClick(dialog: DialogInterface?, which: Int) {
                    when(which){
                        DialogInterface.BUTTON_POSITIVE -> go()
                    }
                }
            }

            builder.setPositiveButton("네", dialog_listener)
            builder.setNegativeButton("아니요",null)
            builder.show()
        }
    }
}