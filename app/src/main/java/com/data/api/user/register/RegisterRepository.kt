package com.data.api.user.register

import com.data.dto.user.register.CertifiedNumberRequest
import com.data.dto.user.register.EmailcodeRequest
import com.data.dto.user.register.RegisterRequest
import com.data.registerApiProvider
import retrofit2.Response

class RegisterRepository {

    suspend fun emailcode(emailcodeRequest: EmailcodeRequest): Response<Void> =
        registerApiProvider.emailcode(emailcodeRequest)

    suspend fun certifiednumber(certifiedNumberRequest: CertifiedNumberRequest): Response<Void> =
        registerApiProvider.certifiedNumber(certifiedNumberRequest)

    suspend fun register(registerRequest: RegisterRequest) : Response<Void> =
        registerApiProvider.register(registerRequest)


}