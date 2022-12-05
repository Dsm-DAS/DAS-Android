package data.api.user.login

import data.dto.user.login.LoginRequest
import data.dto.user.login.LoginResponse
import data.loginApiProvider
import retrofit2.Response


class LoginRepository {

    suspend fun login(loginRequest: LoginRequest): Response<LoginResponse> =
        loginApiProvider.login(loginRequest)

}