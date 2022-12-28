package ui.fragment

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import base.BaseFragment
import com.example.das_android.R
import com.example.das_android.databinding.FragmentWriteClubBinding
import data.dto.club.ClubListResponse
import ui.adapter.ClubRecyclerViewAdapter

class WriteClubFragment : BaseFragment<FragmentWriteClubBinding>(R.layout.fragment_write_club) {

    var data = arrayListOf<ClubListResponse>(
        ClubListResponse("정",R.drawable.img_50,"#프론트엔드 #백엔드", "전공동아리","#WEB", 76),
        ClubListResponse(
            "DMS", R.drawable.img_49,"#프론트엔드 #백엔드 #iOS #안드로이드", "전공동아리", "#WEB  #APP", 47),
        ClubListResponse( "코도모", R.drawable.img_40, "#프론트엔드 #백엔드 #iOS #안드로이드", "전공동아리",
            "#WEB  #APP",
            99
        ),
        ClubListResponse( "GRAM", R.drawable.img_47, "#프론트엔드 #백엔드", "전공동아리", "#APP", 10),

        ClubListResponse( "MoDeep", R.drawable.img_51, "#프론트엔드 #백엔드", "전공동아리", "#AI", 10),


        )



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