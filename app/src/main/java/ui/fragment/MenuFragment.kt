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

class MenuFragment : BaseFragment<FragmentMenuBinding>(R.layout.fragment_menu) {
     fun initView() {

         binding.btnNextProfile.setOnClickListener{

             activity?.let {
                 val intent = Intent(it,MenuProfileFragment::class.java)
                 it.startActivity(intent)
             }
         }

    }

}