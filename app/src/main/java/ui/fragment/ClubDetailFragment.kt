package ui.fragment

import android.os.Bundle
import android.view.View
import base.BaseFragment
import com.example.das_android.R
import com.example.das_android.databinding.FragmentClubDetailBinding
import util.startIntentClearTop

class ClubDetailFragment : BaseFragment<FragmentClubDetailBinding>(R.layout.fragment_club_detail) {
    fun initView() {
        binding.btn.setOnClickListener {
            startIntentClearTop(requireActivity(),WriteFragment::class.java)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }
}