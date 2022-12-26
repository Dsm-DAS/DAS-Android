package viewModel.RecyclerView

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import data.dto.feed.RecruitmentListResponse


class RecruitmentRecyclerViewModel:ViewModel() {
    var liveData: MutableLiveData<ArrayList<RecruitmentListResponse>> = MutableLiveData<ArrayList<RecruitmentListResponse>>()

    init {
        var UserData = ArrayList<RecruitmentListResponse>()
        liveData.postValue(UserData)
    }
}