package ui.activity.auth

import androidx.recyclerview.widget.LinearLayoutManager
import base.BaseActivity
import com.example.das_android.R
import com.example.das_android.databinding.ActivityDetailBinding
import data.dto.user.userList.UserListData
import ui.activity.MainActivity
import ui.adapter.StudentRecyclerViewAdapter2
import util.startIntentClearTop

class DetailActivity : BaseActivity<ActivityDetailBinding>(R.layout.activity_detail) {
    override fun initView(){
        binding.btn.setOnClickListener {
        startIntentClearTop(this,MainActivity::class.java)

        }
        var data = arrayListOf<UserListData>(
            UserListData("김은오",R.drawable.img_das_logo, "10 조회"),
            UserListData("김연우",R.drawable.img_das_logo, "12 조회"),
            UserListData("김철우",R.drawable.img_das_logo, "4 조회"),
            UserListData("박도연",R.drawable.img_das_logo, "21 조회"),



            )

        binding.rv.layoutManager = LinearLayoutManager(this,
            LinearLayoutManager.VERTICAL,false)
        binding.rv.setHasFixedSize(true)
        binding.rv.adapter = StudentRecyclerViewAdapter2(data, mContext = application)
    }

    override fun observeEvent() {

    }
}