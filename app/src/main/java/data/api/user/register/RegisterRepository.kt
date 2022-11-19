package data.api.user.register

import data.dto.user.register.CertifiedNumberRequest
import data.dto.user.register.EmailcodeRequest
import data.dto.user.register.registerRequest
import data.registerApi

class RegisterRepository {

    suspend fun emailcode(emailcodeRequest: EmailcodeRequest) =
        registerApi.emailcode(emailcodeRequest)

    suspend fun certifiedNumber(certifedNumberRequest: CertifiedNumberRequest) =
        registerApi.certifiedNumber(certifedNumberRequest)

    suspend fun register(registerRequest: registerRequest) =
        registerApi.register(registerRequest)


}