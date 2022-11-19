package viewmodel.Register

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import data.api.user.register.RegisterRepository
import data.dto.user.register.EmailcodeRequest


class RegisterViewModel(
    private val re : RegisterRepository
) : ViewModel() {

    private val success : MutableLiveData<Boolean> = MutableLiveData()
    private val failed : MutableLiveData<Int> = MutableLiveData()



}