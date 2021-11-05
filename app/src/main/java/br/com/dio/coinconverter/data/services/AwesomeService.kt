package br.com.dio.coinconverter.data.services

import br.com.dio.coinconverter.data.model.ExchangeResponse
import retrofit2.http.GET
import retrofit2.http.Path

//Interface para método GET
interface AwesomeService {

    @GET("/json/last/{coins}")
    suspend fun exchangeValue(@Path("coins") coins: String): ExchangeResponse
}