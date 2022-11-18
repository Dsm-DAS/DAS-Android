package data
import data.api.user.register.RegisterApi
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {

    private var retrofit: Retrofit? = null

    fun getRetrofit(): Retrofit? {
        return retrofit ?: Retrofit.Builder()
            .baseUrl("BASE_URL")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }


    val registerApi : RegisterApi by lazy {
        retrofit!!.create(RegisterApi::class.java)
    }
}


