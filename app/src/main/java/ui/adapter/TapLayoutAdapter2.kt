package ui.adapter

import android.annotation.SuppressLint
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import ui.fragment.*

class TabLayoutAdapter2(fragment: FragmentActivity?) : FragmentStateAdapter(fragment!!){

    override fun getItemCount(): Int = 3

    @SuppressLint("ResourceType")
    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> SearchRecruitmentFragment()
            1 -> SearchClubFragment()
            else -> SearchStudentFragment()
        }
    }
}