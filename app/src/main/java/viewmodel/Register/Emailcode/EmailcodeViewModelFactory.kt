package viewmodel.Register.Emailcode

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import data.dto.user.register.EmailcodeRequest
import data.api.user.register.EmailcodeRepository

class EmailcodeViewModelFactory(private val emailcodeRepository: EmailcodeRepository) :
    ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return EmailcodeViewModel(emailcodeRepository) as T
    }

}