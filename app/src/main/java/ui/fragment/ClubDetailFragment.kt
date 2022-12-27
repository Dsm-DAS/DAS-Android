package ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import base.BaseFragment
import com.example.das_android.R
import com.example.das_android.databinding.FragmentClubDetailBinding
import com.example.das_android.databinding.FragmentHomeBinding
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