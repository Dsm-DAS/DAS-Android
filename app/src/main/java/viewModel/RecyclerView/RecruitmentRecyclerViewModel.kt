package viewModel.RecyclerView

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import data.dto.feed.RecruitmentListResponse


class RecruitmentRecyclerViewModel:ViewModel() {
    var liveData: MutableLiveData<ArrayList<RecruitmentListResponse>> = MutableLiveData<ArrayList<RecruitmentListResponse>>()

    init {
        var UserData = ArrayList<RecruitmentListResponse>()
        UserData.add(RecruitmentListResponse("","DMS 모집합니다","프론트, 백엔드, 안드로이드, ios (D-10)"))
        UserData.add(RecruitmentListResponse("","GRAM 프론트엔드 모집합니다","프론트엔드 (D-5)"))
        liveData.postValue(UserData)
    }
}