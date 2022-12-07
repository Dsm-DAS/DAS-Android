package com.data.api.user.login

import com.data.dto.user.login.LoginRequest
import com.data.dto.user.login.LoginResponse
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface LoginApi {

    @POST("/user/token")
    fun login(
        @Body loginRequest: LoginRequest
    ) : Response<LoginResponse>

}