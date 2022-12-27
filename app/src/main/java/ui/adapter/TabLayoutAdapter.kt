package ui.adapter

import android.annotation.SuppressLint
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import ui.fragment.FragmentWrite_Student
import ui.fragment.WriteClubFragment
import ui.fragment.WriteRecruitmentFragment


class TabLayoutAdapter(fragment: FragmentActivity?) : FragmentStateAdapter(fragment!!){

    override fun getItemCount(): Int = 3

    @SuppressLint("ResourceType")
    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> WriteRecruitmentFragment()
            1 -> WriteClubFragment()
            else -> FragmentWrite_Student()
        }
    }
}
