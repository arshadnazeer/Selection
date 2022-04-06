package com.arsh.carselection.presentation.di.manufacturer

import com.arsh.carselection.domain.usecase.GetManufacturersUseCase
import com.arsh.carselection.presentation.manufacturer.ManufacturerViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class ManufacturerModule {

    @ManufacturerScope
    @Provides
    fun ProvideManufacturerViewModelFactory(
        getManufacturersUseCase: GetManufacturersUseCase
    ) : ManufacturerViewModelFactory{
        return ManufacturerViewModelFactory(getManufacturersUseCase)
    }
}