package data.api.user.register

import data.dto.user.register.CertifiedNumberRequest
import data.dto.user.register.EmailcodeRequest
import data.dto.user.register.registerRequest
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.PUT

interface RegisterApi {


    //이메일 인증
    @POST("/user/email")
    fun emailcode(
        @Body emailcodeRequest: EmailcodeRequest
    ) : Call<Void>

    //이메일 인증번호
    @PUT("/user/email")
    fun certifiedNumber(
        @Body certifiedNumberRequest: CertifiedNumberRequest
    ) : Call<Void>

    //회원가입
    @POST("/user/signup")
    fun register(
        @Body registerRequest: registerRequest
    ) : Call<Void>

}

