package data.api.user.login

import data.dto.user.login.LoginRequest
import data.dto.user.login.LoginResponse
import data.loginApi
import retrofit2.Call
import retrofit2.Response


class LoginRepository {
    suspend fun login(loginRequest: LoginRequest): Call<LoginResponse> =
        loginApi.login(loginRequest)
}