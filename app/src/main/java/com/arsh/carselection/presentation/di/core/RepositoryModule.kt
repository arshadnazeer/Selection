package com.arsh.carselection.presentation.di.core

import com.arsh.carselection.data.repository.ManufacturerRepositoryImpl
import com.arsh.carselection.data.repository.ModelRepositoryImpl
import com.arsh.carselection.data.repository.YearRepositoryImpl
import com.arsh.carselection.data.repository.datasource.ManufacturerRemoteDataSource
import com.arsh.carselection.data.repository.datasource.ModelRemoteDataSource
import com.arsh.carselection.data.repository.datasource.YearRemoteDataSource
import com.arsh.carselection.domain.repository.ManufacturerRepository
import com.arsh.carselection.domain.repository.ModelRepository
import com.arsh.carselection.domain.repository.YearRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule() {

    @Singleton
    @Provides
    fun provideManufacturerRepository(
        manufacturerRemoteDataSource: ManufacturerRemoteDataSource
    ): ManufacturerRepository{
        return ManufacturerRepositoryImpl(manufacturerRemoteDataSource)

    }

    @Singleton
    @Provides
    fun provideModelRepository(
        modelRemoteDataSource: ModelRemoteDataSource
    ): ModelRepository{
        return ModelRepositoryImpl(modelRemoteDataSource)

    }

    @Singleton
    @Provides
    fun provideYearRepository(
        yearRemoteDataSource: YearRemoteDataSource
    ): YearRepository{
        return YearRepositoryImpl(yearRemoteDataSource)

    }
}