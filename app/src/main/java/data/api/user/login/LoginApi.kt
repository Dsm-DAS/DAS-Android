package data.api.user.login

import data.dto.user.login.LoginRequest
import data.dto.user.login.LoginResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface LoginApi {

    @POST("/user/token")
    fun login(
        @Body loginRequest: LoginRequest
    ) : Call<LoginResponse>

}