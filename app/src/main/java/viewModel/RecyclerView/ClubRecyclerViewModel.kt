package viewModel.RecyclerView

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import data.dto.club.ClubListResponse

class ClubRecyclerViewModel: ViewModel() {
    var liveData : MutableLiveData<ArrayList<ClubListResponse>> = MutableLiveData<ArrayList<ClubListResponse>>()

    init {
        var UserData = ArrayList<ClubListResponse>()
        UserData.add(ClubListResponse("정","","#프론트엔드 #백엔드", "전공동아리","WEB", 76))
        UserData.add(ClubListResponse("DMS","","#프론트엔드 #백엔드 #iOS #안드로이드","전공동아리","WEB, APP", 47))
        UserData.add(ClubListResponse("GRAM","","#iOS #안드로이드 #백엔드","전공동아리","APP", 88 ))
        UserData.add(ClubListResponse("코도모","","#프론트엔드 #백엔드 #iOS #안드로이드","전공동아리", "WEB, APP", 99))
        UserData.add(ClubListResponse("시나브로","","#프론트엔드 #백엔드","전공동아리", "WEB", 10))
        liveData.postValue(UserData)
    }
}