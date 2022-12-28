package ui.fragment

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import base.BaseFragment
import com.example.das_android.R
import com.example.das_android.databinding.FragmentWriteStudentBinding
import data.dto.club.ClubListResponse
import data.dto.user.userList.UserListData
import ui.adapter.StudentRecyclerViewAdapter
import viewModel.RecyclerView.ClubRecyclerViewModel

class FragmentWrite_Student : BaseFragment<FragmentWriteStudentBinding>(R.layout.fragment_write__student) {
    var data = arrayListOf<UserListData>(
        UserListData("김은오",R.drawable.img_das_logo, "18 조회"),
        UserListData("김연우",R.drawable.img_das_logo, "11 조회"),
        UserListData("양운석",R.drawable.img_das_logo, "9 조회"),
        UserListData("정지관",R.drawable.img_das_logo, "30 조회"),


        )

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }
    fun initView() {
        binding.rvStudent.layoutManager = LinearLayoutManager(activity,
            LinearLayoutManager.VERTICAL,false)
        binding.rvStudent.setHasFixedSize(true)
        binding.rvStudent.adapter = StudentRecyclerViewAdapter(data,requireActivity().application)
    }
}