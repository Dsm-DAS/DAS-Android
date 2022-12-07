package com.data.api.user.login

import com.data.dto.user.login.LoginRequest
import com.data.dto.user.login.LoginResponse
import com.data.loginApiProvider
import retrofit2.Response


class LoginRepository {

    suspend fun login(loginRequest: LoginRequest): Response<LoginResponse> =
        loginApiProvider.login(loginRequest)

}