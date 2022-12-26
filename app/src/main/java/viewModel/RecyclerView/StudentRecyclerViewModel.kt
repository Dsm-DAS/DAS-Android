package viewModel.RecyclerView

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import data.dto.user.userList.UserListResponse

class StudentRecyclerViewModel :ViewModel(){
    var liveData : MutableLiveData<ArrayList<UserListResponse>> = MutableLiveData<ArrayList<UserListResponse>>()

    init {
        var UserData = ArrayList<UserListResponse>()
        liveData.postValue(UserData)
    }
}