package data

import data.api.user.login.LoginApi
import data.api.user.register.RegisterApi
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


private val retrofit: Retrofit = Retrofit.Builder().apply {
        baseUrl(BASE_URL)
        addConverterFactory(GsonConverterFactory.create())
    }.build()

 val registerApi: RegisterApi by lazy {
     retrofit.create(RegisterApi::class.java)
 }


val loginApi: LoginApi by lazy {
    retrofit.create(LoginApi::class.java)
}


