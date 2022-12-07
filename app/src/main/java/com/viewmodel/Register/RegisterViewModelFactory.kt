package com.viewmodel.Register

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.data.api.user.register.RegisterRepository

@Suppress("UNCHECKED_CAST")
class RegisterViewModelFactory(private val registerRepository: RegisterRepository) :
    ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return RegisterViewModel(registerRepository) as T
    }
}