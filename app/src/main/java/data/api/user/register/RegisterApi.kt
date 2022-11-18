package data.api.user.register

import data.dto.user.register.EmailcodeRequest
import data.dto.user.register.EmailcodeResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface RegisterApi {

    @POST("/user/email")
    suspend fun emailcode(
        @Body emailcodeRequest: EmailcodeRequest
    ) : Response<EmailcodeResponse>
}

