package data.api.user.register

import data.dto.user.register.CertifiedNumberRequest
import data.dto.user.register.EmailcodeRequest
import data.dto.user.register.RegisterRequest
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

