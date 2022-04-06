package com.arsh.carselection.presentation.di.core

import com.arsh.carselection.presentation.di.manufacturer.ManufacturerSubComponent
import com.arsh.carselection.presentation.di.model.ModelSubComponent
import com.arsh.carselection.presentation.di.year.YearSubComponent
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AppModule::class,
    NetModule::class,
    UseCaseModule::class,
    RemoteDataModule::class,
    RepositoryModule::class,
])
interface AppComponent {

    fun manufacturerSubComponent():ManufacturerSubComponent.Factory
    fun modelSubComponent():ModelSubComponent.Factory
    fun yearSubComponent():YearSubComponent.Factory

}