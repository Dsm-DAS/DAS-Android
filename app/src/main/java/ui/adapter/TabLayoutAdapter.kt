package ui.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import ui.fragment.FragmentWrite_Student
import ui.fragment.WriteClubFragment
import ui.fragment.WriteFragment
import ui.fragment.WriteRecruitmentFragment


class TabLayoutAdapter(fragment: WriteFragment) : FragmentStateAdapter(fragment){

    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> WriteRecruitmentFragment()
            1 -> WriteClubFragment()
            else -> FragmentWrite_Student()
        }
    }
}
