package com.data.api.user.register

import com.data.dto.user.register.CertifiedNumberRequest
import com.data.dto.user.register.EmailcodeRequest
import com.data.dto.user.register.RegisterRequest
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.PUT

interface RegisterApi {


    //이메일 인증
    @POST("/user/email")
    suspend fun emailcode(
        @Body emailcodeRequest: EmailcodeRequest
    ) : Response<Void>

    //이메일 인증번호
    @PUT("/user/email")
    suspend fun certifiedNumber(
        @Body certifiedNumberRequest: CertifiedNumberRequest
    ) : Response<Void>

    //회원가입
    @POST("/user/signup")
    suspend fun register(
        @Body registerRequest: RegisterRequest
    ) : Response<Void>

}

