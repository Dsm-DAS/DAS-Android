package ui.fragment

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import base.BaseFragment
import com.example.das_android.R
import com.example.das_android.databinding.FragmentSearchStudentBinding
import data.dto.user.userList.UserListData
import ui.adapter.SearchStudentRecyclerViewAdpater
import ui.adapter.StudentRecyclerViewAdapter

class SearchStudentFragment : BaseFragment<FragmentSearchStudentBinding>(R.layout.fragment_search_student){

    var data = arrayListOf<UserListData>(
        UserListData("김은오",R.drawable.img_das_logo, "10 조회"),
        UserListData("김연우",R.drawable.img_das_logo, "28 조회"),
        UserListData("박도연",R.drawable.img_das_logo, "11 조회"),
        UserListData("양운석",R.drawable.img_das_logo, "19 조회"),
        UserListData("강지인",R.drawable.img_das_logo, "5 조회"),

        )

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }
    fun initView() {
        binding.rvRecruitment.layoutManager = LinearLayoutManager(activity,
            LinearLayoutManager.VERTICAL,false)
        binding.rvRecruitment.setHasFixedSize(true)
        binding.rvRecruitment.adapter = SearchStudentRecyclerViewAdpater(data,requireActivity().application)
    }
}