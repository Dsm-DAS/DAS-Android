package viewmodel.Register

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import data.api.user.register.RegisterRepository
import data.dto.user.register.CertifiedNumberRequest
import data.dto.user.register.EmailcodeRequest
import data.dto.user.register.RegisterRequest
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Response


class RegisterViewModel(
    private val registerRepository : RegisterRepository
) : ViewModel() {


    private val _emailcodeResponse = MutableLiveData<Response<Void>>()
    val emailcodeResponse: LiveData<Response<Void>> = _emailcodeResponse

    private val _certifidenumberResponse = MutableLiveData<Response<Void>>()
    val certifiednumberResponse: LiveData<Response<Void>> = _certifidenumberResponse

    private val _registerResponse = MutableLiveData<Response<Void>>()
    val registerResponse: LiveData<Response<Void>> = _registerResponse

    companion object{

        var email: String? = null




    }



    fun emailcode(
        email: String
    ){
        val emailcodeRequest = EmailcodeRequest(email)
        viewModelScope.launch(Dispatchers.IO) {
            _emailcodeResponse.postValue(registerRepository.emailcode(emailcodeRequest))
        }
    }


    fun certifiedNumber(
        email: String,
        code: String
    ){
        val certifiedNumberRequest = CertifiedNumberRequest(email, code)
        viewModelScope.launch(Dispatchers.IO) {
            _certifidenumberResponse.postValue(registerRepository.certifiednumber(certifiedNumberRequest))
        }
    }

    fun register(
        password: String,
        name: String,
        grade: Int,
        class_num: Int,
        number: Int,
        sex: String,
    ){
        val registerRequest = RegisterRequest(email!!,password, name,grade,class_num,number,sex)
        viewModelScope.launch(Dispatchers.IO) {
            _registerResponse.postValue(registerRepository.register(registerRequest))
        }
    }
}