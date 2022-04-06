package com.arsh.carselection.presentation.di.core

import com.arsh.carselection.data.api.CarServiceInterface
import com.arsh.carselection.data.repository.datasource.ManufacturerRemoteDataSource
import com.arsh.carselection.data.repository.datasource.ModelRemoteDataSource
import com.arsh.carselection.data.repository.datasource.YearRemoteDataSource
import com.arsh.carselection.data.repository.datasourceImpl.ManufacturerRemoteDataSourceImpl
import com.arsh.carselection.data.repository.datasourceImpl.ModelremoteDataSourceImpl
import com.arsh.carselection.data.repository.datasourceImpl.YearRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RemoteDataModule(
    private val apiKey: String,
    private val manufacturer: Int,
    private val mainType: String
) {
    @Singleton
    @Provides
    fun provideManufacturerRemoteDataSource(carServiceInterface: CarServiceInterface) : ManufacturerRemoteDataSource{
        return ManufacturerRemoteDataSourceImpl(
            carServiceInterface,apiKey
        )
    }

    @Singleton
    @Provides
    fun provideModelRemoteDataSource(carServiceInterface: CarServiceInterface) : ModelRemoteDataSource{
        return ModelremoteDataSourceImpl(
            carServiceInterface,apiKey,manufacturer
        )
    }

    @Singleton
    @Provides
    fun provideYearRemoteDataSource(carServiceInterface: CarServiceInterface) : YearRemoteDataSource{
        return YearRemoteDataSourceImpl(
            carServiceInterface,apiKey,manufacturer,mainType
        )
    }
}