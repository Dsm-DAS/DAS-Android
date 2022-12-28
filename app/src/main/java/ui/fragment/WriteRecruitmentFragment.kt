package ui.fragment

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import base.BaseFragment
import com.example.das_android.R
import com.example.das_android.databinding.FragmentWriteRecruitmentBinding
import data.dto.feed.RecruitmentListResponse
import ui.adapter.RecruitmentRecyclerViewAdapter
import viewModel.RecyclerView.RecruitmentRecyclerViewModel

class WriteRecruitmentFragment : BaseFragment<FragmentWriteRecruitmentBinding>(R.layout.fragment_write_recruitment) {

    var data = arrayListOf<RecruitmentListResponse>(

        RecruitmentListResponse("","동아리원 모집합니다.","코도모 전공동아리 모집합니다.")
    )


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }
    fun initView() {
        binding.rvRecruitment.layoutManager = LinearLayoutManager(activity,LinearLayoutManager.VERTICAL,false)
        binding.rvRecruitment.setHasFixedSize(true)
        binding.rvRecruitment.adapter = RecruitmentRecyclerViewAdapter(data,requireActivity().application)
    }
}

