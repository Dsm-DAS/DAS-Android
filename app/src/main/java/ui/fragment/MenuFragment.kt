package ui.fragment

import android.content.Intent
import android.os.Bundle
import android.view.View
import base.BaseFragment
import com.example.das_android.R
import com.example.das_android.databinding.ActivittyMenuBinding
import ui.activity.MenuProfileActivity

class MenuFragment : BaseFragment<ActivittyMenuBinding>(R.layout.activitty_menu) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val intent = Intent(requireActivity(),MenuProfileActivity::class.java)

        binding.btnNextProfile.setOnClickListener{
            startActivity(intent)
        }


    }
}