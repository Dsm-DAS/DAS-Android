package viewmodel.Login

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import data.api.user.login.LoginRepository
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import data.dto.user.login.LoginRequest
import data.dto.user.login.LoginResponse
import data.dto.user.register.CertifiedNumberRequest
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Response

class LoginViewModel (
    private val loginRepository: LoginRepository
):ViewModel() {

    private val _loginResponse = MutableLiveData<Response<LoginResponse>>()
    val loginResponse : LiveData<Response<LoginResponse>> = _loginResponse

    fun postLogin(
        email: String,
        password : String
    ){
        val loginRequest = LoginRequest(email,password)
        viewModelScope.launch(Dispatchers.IO) {
            _loginResponse.postValue(loginRepository.login(loginRequest))
        }
    }
}
