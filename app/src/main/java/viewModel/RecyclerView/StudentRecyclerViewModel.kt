package viewModel.RecyclerView

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import data.dto.user.userList.UserListResponse
class StudentRecyclerViewModel:ViewModel() {

    var liveData : MutableLiveData<ArrayList<UserListResponse>> = MutableLiveData<ArrayList<UserListResponse>>()

    init {
        var UserData = ArrayList<UserListResponse>()
        UserData.add(UserListResponse("김은오","",1, "1학년", "2반", "안드로이드 개발자입니다."))
        UserData.add(UserListResponse("김연우","",2, "1학년", "1반", "안드로이드 마스터입니다."))
        UserData.add(UserListResponse("김철우","",3, "1학년", "3반", "프론트 꿈나무입니다."))
        UserData.add(UserListResponse("강지인","",4, "1학년", "2반","프론트 장인입니다." ))
        UserData.add(UserListResponse("정지관","",5, "1학년", "2반", "프론트 1짱입니다."))
        UserData.add(UserListResponse("양운석","",2, "1학년", "3반", "백엔드 주니어입니다."))
        UserData.add(UserListResponse("이정호","",2, "1학년", "1반", "정3등 백엔드입니다."))
        UserData.add(UserListResponse("강민","",2, "1학년", "3반", "백엔드 장인입니다."))
        liveData.postValue(UserData)
    }
}