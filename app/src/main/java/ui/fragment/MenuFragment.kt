package ui.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import base.BaseFragment
import com.example.das_android.R
import com.example.das_android.databinding.FragmentHomeBinding
import com.example.das_android.databinding.FragmentMenuBinding
import ui.activity.MenuProfileActivity
import util.startIntent
import util.startIntentClearTop

class MenuFragment : BaseFragment<FragmentMenuBinding>(R.layout.fragment_menu) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val intent = Intent(requireActivity(),MenuProfileActivity::class.java)

        binding.btnNextProfile.setOnClickListener{
            startActivity(intent)
        }


    }
}