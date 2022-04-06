package com.arsh.carselection.data.api

import com.arsh.carselection.BuildConfig
import com.arsh.carselection.data.model.manufacturer.Manufacturer
import com.arsh.carselection.data.model.models.Model
import com.arsh.carselection.data.model.year.Year
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface CarServiceInterface {

    @GET("/manufacturer")
    suspend fun getManufacturers(
        @Query("wa_key")
        apiKey: String,
        @Query("page")
        page: String = BuildConfig.page,
        @Query("pageSize")
        pageSize: String = BuildConfig.pageSize
    ):Response<Manufacturer>

    @GET("/main-types")
    suspend fun getModels(
        @Query("wa_key")apiKey: String,
        @Query("manufacturer")manufacturer:Int
    ): Response<Model>

    @GET("/built-dates")
    suspend fun getYear(
        @Query("wa_key")apiKey: String,
        @Query("manufacturer")manufacturer:Int,
        @Query("main-type")mainType:String
    ):Response<Year>

}