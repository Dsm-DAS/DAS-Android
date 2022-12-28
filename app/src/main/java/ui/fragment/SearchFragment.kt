package ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import base.BaseFragment
import com.example.das_android.R
import com.example.das_android.databinding.FragmentHomeBinding
import com.example.das_android.databinding.FragmentSearchBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import ui.adapter.TabLayoutAdapter
import ui.adapter.TabLayoutAdapter2
import util.startIntentClearTop

class SearchFragment : BaseFragment<FragmentSearchBinding>(R.layout.fragment_search) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView(){
        binding.tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                //TODO("Not yet implemented")
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                //TODO("Not yet implemented")
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
                //TODO("Not yet implemented")
            }

        })


        binding.pager.adapter = TabLayoutAdapter2(activity)

        TabLayoutMediator(binding.tabLayout, binding.pager) { tap, position ->
            when(position){
                0 -> tap.text = "모집 공고"
                1 -> tap.text = "동아리"
                2 -> tap.text = "학생"
            }
        }.attach()
    }
}