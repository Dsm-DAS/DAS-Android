package viewModel.RecyclerView

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import data.dto.club.ClubListResponse

class ClubRecyclerViewModel: ViewModel() {
    var liveData: MutableLiveData<ArrayList<ClubListResponse>> = MutableLiveData<ArrayList<ClubListResponse>>()

    init {
        var UserData = ArrayList<ClubListResponse>()
        liveData.postValue(UserData)
    }
}