package ui.activity.auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import base.BaseActivity
import com.example.das_android.R
import com.example.das_android.databinding.ActivityDetailBinding
import com.example.das_android.databinding.ActivityLoginBinding
import data.dto.club.ClubListResponse
import data.dto.user.userList.UserListData
import ui.activity.MainActivity
import ui.adapter.ClubRecyclerViewAdapter
import ui.adapter.StudentRecyclerViewAdapter
import ui.adapter.StudentRecyclerViewAdapter2
import ui.fragment.WriteFragment
import util.startIntent
import util.startIntentClearTop
import viewModel.RecyclerView.ClubRecyclerViewModel

class DetailActivity : BaseActivity<ActivityDetailBinding>(R.layout.activity_detail) {
    override fun initView(){
        binding.btn.setOnClickListener {
        startIntentClearTop(this,MainActivity::class.java)

        }
        var data = arrayListOf<UserListData>(
            UserListData("김은오","",20),
            UserListData("김연우","",10),
            UserListData("정지관","",20),
            UserListData("박도연","",30),
            UserListData("양운석","",9)

        )
        binding.rv.layoutManager = LinearLayoutManager(this,
            LinearLayoutManager.VERTICAL,false)
        binding.rv.setHasFixedSize(true)
        binding.rv.adapter = StudentRecyclerViewAdapter2(data)
    }

    override fun observeEvent() {

    }
}