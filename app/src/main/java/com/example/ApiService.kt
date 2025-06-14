package com.example

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.POST

data class QuizResult(
    val nomeUsuario: String,
    val resultadoDiscipulo: String
)

interface ApiService {
    @POST("api/quiz/salvar")
    fun enviarResultado(@Body resultado: QuizResult): Call<QuizResult>
}

object RetrofitClient {
    private const val BASE_URL = "https://backendcristao-user123.repl.co/"

    val apiService: ApiService by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService::class.java)
    }
}
