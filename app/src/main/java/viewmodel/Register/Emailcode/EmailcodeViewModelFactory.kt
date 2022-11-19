package viewmodel.Register.Emailcode

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class EmailcodeViewModelFactory(private val emailcodeViewModel: EmailcodeViewModel) :
    ViewModelProvider.Factory{
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return EmailcodeViewModel(emailcodeViewModel) as T
    }
}