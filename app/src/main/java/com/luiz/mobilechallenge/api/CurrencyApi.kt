package com.luiz.mobilechallenge.model.api

import com.luiz.mobilechallenge.model.response.ConvertResponse
import com.luiz.mobilechallenge.model.response.CurrencyListResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface CurrencyApi {
    companion object {
        private const val ACCESS_KEY:String = "?access_key=d24faeca5e2eb48fa80bce9e1d5c3b46"
    }

    @GET("list$ACCESS_KEY")
    fun listCurrencies():Call<CurrencyListResponse>

    @GET("live$ACCESS_KEY&currencies=")
    fun convert(@Query("currencies") currencies:String):Call<ConvertResponse>
}