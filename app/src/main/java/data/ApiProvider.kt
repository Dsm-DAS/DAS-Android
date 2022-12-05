package data

import data.api.user.login.LoginApi
import data.api.user.register.RegisterApi
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import util.BASE_URL


private val retrofit: Retrofit = Retrofit.Builder().apply {
    baseUrl(BASE_URL)
    addConverterFactory(GsonConverterFactory.create())
    }.build()

 val registerApiProvider: RegisterApi by lazy {
     retrofit.create(RegisterApi::class.java)
 }



val loginApiProvider: LoginApi by lazy {
    retrofit.create(LoginApi::class.java)
}


