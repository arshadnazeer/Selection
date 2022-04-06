package com.arsh.carselection.presentation.di.core

import com.arsh.carselection.domain.repository.ManufacturerRepository
import com.arsh.carselection.domain.repository.ModelRepository
import com.arsh.carselection.domain.repository.YearRepository
import com.arsh.carselection.domain.usecase.GetManufacturersUseCase
import com.arsh.carselection.domain.usecase.GetModelsUseCase
import com.arsh.carselection.domain.usecase.GetYearUseCase
import dagger.Module
import dagger.Provides

@Module
class UseCaseModule {

    @Provides
    fun provideGetManufacturerUseCase(manufacturerRepository: ManufacturerRepository) : GetManufacturersUseCase{
        return GetManufacturersUseCase(manufacturerRepository)
    }

    @Provides
    fun provideGetModelUseCase(modelRepository: ModelRepository) : GetModelsUseCase{
        return GetModelsUseCase(modelRepository)
    }

    @Provides
    fun provideGetYearUseCase(yearRepository: YearRepository) : GetYearUseCase{
        return GetYearUseCase(yearRepository)
    }
}