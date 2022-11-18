package viewmodel.Register.Emailcode

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import data.api.user.register.EmailcodeRepository
import data.dto.user.register.EmailcodeRequest
import retrofit2.Response


class EmailcodeViewModel(
    private val ec: EmailcodeRepository
) : ViewModel() {

    private val success : MutableLiveData<Boolean> = MutableLiveData()
    private val failed : MutableLiveData<Int> = MutableLiveData()

    suspend fun emailcode(emailcodeRequest: EmailcodeRequest) {
        ec.email(emailcodeRequest)
    }

}