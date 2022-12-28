package viewModel.RecyclerView

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.das_android.R
import data.dto.club.ClubListResponse

class ClubRecyclerViewModel: ViewModel() {
    var liveData : MutableLiveData<ArrayList<ClubListResponse>> = MutableLiveData<ArrayList<ClubListResponse>>()

    init {
        var UserData = ArrayList<ClubListResponse>()
        UserData.add(ClubListResponse(
            "정",
            R.drawable.img_50,
            "#프론트엔드 #백엔드",
            "전공동아리",
            "WEB",
            76
        ))
        UserData.add(ClubListResponse(
            "DMS",
            R.drawable.img_49,
            "#프론트엔드 #백엔드 #iOS #안드로이드",
            "전공동아리",
            "WEB, APP",
            47
        ))
        UserData.add(ClubListResponse(
            "GRAM",
            R.drawable.img_47,
            "#iOS #안드로이드 #백엔드",
            "전공동아리",
            "APP",
            88
        ))
        UserData.add(ClubListResponse(
            "코도모",
            R.drawable.img_40,
            "#프론트엔드 #백엔드 #iOS #안드로이드",
            "전공동아리",
            "WEB, APP",
            99
        ))
        liveData.postValue(UserData)
    }
}