package data.api.user.register

import data.dto.user.register.CertifiedNumberRequest
import data.dto.user.register.EmailcodeRequest
import data.dto.user.register.RegisterRequest
import data.registerApiProvider
import retrofit2.Response

class RegisterRepository {

    suspend fun emailcode(emailcodeRequest: EmailcodeRequest): Response<Void> =
        registerApiProvider.emailcode(emailcodeRequest)

    suspend fun certifiednumber(certifiedNumberRequest: CertifiedNumberRequest): Response<Void> =
        registerApiProvider.certifiedNumber(certifiedNumberRequest)

    suspend fun register(registerRequest: RegisterRequest) : Response<Void> =
        registerApiProvider.register(registerRequest)


}