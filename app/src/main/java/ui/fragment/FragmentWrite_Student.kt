package ui.fragment

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import base.BaseFragment
import com.example.das_android.R
import com.example.das_android.databinding.FragmentMenuBinding
import com.example.das_android.databinding.FragmentWriteStudentBinding
import data.dto.club.ClubListResponse
import data.dto.user.userList.UserListData
import ui.adapter.StudentRecyclerViewAdapter
import viewModel.RecyclerView.ClubRecyclerViewModel

class FragmentWrite_Student : BaseFragment<FragmentWriteStudentBinding>(R.layout.fragment_write__student) {
    var data = arrayListOf<UserListData>(
        UserListData("김은오","",20, "1","2", "안드로이드 공부중"),
        UserListData("김연우","",10,"1","1", "안드로이드 공부중"),
        UserListData("정지관","",20,"1","2", "프론트엔드 공부중" ),
        UserListData("박도연","",30,"1", "4", "iOS 공부중"),
        UserListData("양운석","",9,"1", "3", "백엔드 공부중")

    )

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }
    fun initView() {
        binding.rvStudent.layoutManager = LinearLayoutManager(activity,
            LinearLayoutManager.VERTICAL,false)
        binding.rvStudent.setHasFixedSize(true)
        binding.rvStudent.adapter = StudentRecyclerViewAdapter(data)
    }
}