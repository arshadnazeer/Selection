package com.arsh.carselection.presentation.di.year

import com.arsh.carselection.domain.usecase.GetManufacturersUseCase
import com.arsh.carselection.domain.usecase.GetYearUseCase
import com.arsh.carselection.presentation.manufacturer.ManufacturerViewModelFactory
import com.arsh.carselection.presentation.manufacturer.YearViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class YearModule {

    @YearScope
    @Provides
    fun ProvideYearViewModelFactory(
        getYearUseCase: GetYearUseCase
    ) : YearViewModelFactory{
        return YearViewModelFactory(getYearUseCase)
    }
}