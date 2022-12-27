package ui.fragment

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import base.BaseFragment
import com.example.das_android.R
import com.example.das_android.databinding.FragmentWriteBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import ui.adapter.TabLayoutAdapter

class WriteFragment : BaseFragment<FragmentWriteBinding>(R.layout.fragment_write) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }
    @SuppressLint("ResourceType")
    private fun initView() {
        binding.tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                // 탭이 선택되지 않은 상태로 변경 되었을 때
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
                // 이미 선택된 탭이 다시 선택 되었을 때
            }
        })

        // 뷰페이저에 어댑터 연결
        binding.pager.adapter = TabLayoutAdapter(activity)
        /* 탭과 뷰페이저를 연결, 여기서 새로운 탭을 다시 만드므로 레이아웃에서 꾸미지말고
        여기서 꾸며야함
         */
        TabLayoutMediator(binding.tabLayout, binding.pager) { tab, position ->
            when (position) {
                0 -> tab.text = "모집 공고"
                1 -> tab.text = "동아리"
                2 -> tab.text = "학생"
            }
        }.attach()
    }

}
