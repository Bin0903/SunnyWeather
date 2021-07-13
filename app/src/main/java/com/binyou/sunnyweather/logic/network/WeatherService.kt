package com.binyou.sunnyweather.logic.network

import com.binyou.sunnyweather.SunnyWeatherApplication
import com.binyou.sunnyweather.logic.model.DailyResponse
import com.binyou.sunnyweather.logic.model.RealtimeResponse
import com.binyou.sunnyweather.logic.model.Weather
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface WeatherService {

    @GET("v2.5/${SunnyWeatherApplication.TOKEN}/{lng},{lat}/realtime.json")
    fun getRealtimeWeather(@Path("lng") lng: String, @Path("lat") lat: String): Call<RealtimeResponse>

    @GET("v2.5/${SunnyWeatherApplication.TOKEN}/{lng},{lat}/daily.json")
    fun getDailyWeather(@Path("lng") lng: String, @Path("lat") lat: String): Call<DailyResponse>
}