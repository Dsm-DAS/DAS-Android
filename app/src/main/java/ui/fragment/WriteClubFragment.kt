package ui.fragment

import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import base.BaseFragment
import com.example.das_android.R
import com.example.das_android.databinding.FragmentWriteClubBinding
import data.dto.club.ClubListResponse
import ui.adapter.ClubRecyclerViewAdapter
import ui.adapter.RecruitmentRecyclerViewAdapter
import viewModel.RecyclerView.ClubRecyclerViewModel

class WriteClubFragment : BaseFragment<FragmentWriteClubBinding>(R.layout.fragment_write_club) {

    var data = arrayListOf<ClubListResponse>(
        ClubListResponse("정","","#프론트엔드 #백엔드", "전공동아리","WEB", 76),
        ClubListResponse("DMS","","#프론트엔드 #백엔드 #iOS #안드로이드","전공동아리","WEB, APP", 47),
        ClubListResponse("GRAM","","#iOS #안드로이드 #백엔드","전공동아리","APP", 88 ),
        ClubListResponse("코도모","","#프론트엔드 #백엔드 #iOS #안드로이드","전공동아리", "WEB, APP", 99),
        ClubListResponse("시나브로","","#프론트엔드 #백엔드","전공동아리", "WEB", 10),

    )
    lateinit var viewModel: ClubRecyclerViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }
    fun initView() {
        binding.rvClub.layoutManager = LinearLayoutManager(activity,LinearLayoutManager.VERTICAL,false)
        binding.rvClub.setHasFixedSize(true)
        binding.rvClub.adapter = ClubRecyclerViewAdapter(data,requireActivity().application)
    }
}