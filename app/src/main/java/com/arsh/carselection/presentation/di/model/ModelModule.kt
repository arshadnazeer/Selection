package com.arsh.carselection.presentation.di.model

import com.arsh.carselection.domain.usecase.GetManufacturersUseCase
import com.arsh.carselection.domain.usecase.GetModelsUseCase
import com.arsh.carselection.presentation.manufacturer.ManufacturerViewModelFactory
import com.arsh.carselection.presentation.manufacturer.ModelViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class ModelModule {

    @ModelScope
    @Provides
    fun ProvideModelViewModelFactory(
        getModelsUseCase: GetModelsUseCase
    ) : ModelViewModelFactory{
        return ModelViewModelFactory(getModelsUseCase)
    }
}