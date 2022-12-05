package viewmodel.Login

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import data.api.user.login.LoginRepository
import data.dto.user.login.LoginRequest
import android.content.ContentValues.TAG
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class LoginViewModel (
    private val repository: LoginRepository
):ViewModel() {


    val success: MutableLiveData<Boolean> = MutableLiveData()
    val failure: MutableLiveData<Boolean> = MutableLiveData()



    fun postLogin(loginRequest: LoginRequest) {
        Log.d(TAG, "postLogin : ")
        viewModelScope.launch {
            kotlin.runCatching {
                repository.login(loginRequest)
            }.onSuccess {
                success
            }.onFailure {
                failure
            }.also {
                Log.d(TAG, "$success,$failure")
            }
        }
    }
}
