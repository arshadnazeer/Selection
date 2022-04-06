package com.arsh.carselection.presentation.di.core

import com.arsh.carselection.data.api.CarServiceInterface
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class NetModule(
    private val baseUrl : String
) {
    @Singleton
    @Provides
    fun provideRetrofit():Retrofit{
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(baseUrl)
            .build()
    }

    @Singleton
    @Provides
    fun provideCarServiceInterface(retrofit: Retrofit) : CarServiceInterface{
        return retrofit.create(CarServiceInterface::class.java)
    }
}