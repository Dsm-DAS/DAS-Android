package viewmodel.Register.CertifiedNumber

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import data.api.user.register.RegisterRepository

class CertifiedNumberViewModelFactory(private val certifiedNumberViewModel: RegisterRepository) :
    ViewModelProvider.Factory{
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return CertifiedNumberViewModel(certifiedNumberViewModel) as T
    }
}