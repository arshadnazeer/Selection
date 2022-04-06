package com.arsh.carselection.presentation

import android.app.Application
import com.arsh.carselection.BuildConfig
import com.arsh.carselection.presentation.di.Injector
import com.arsh.carselection.presentation.di.core.*
import com.arsh.carselection.presentation.di.manufacturer.ManufacturerSubComponent
import com.arsh.carselection.presentation.di.model.ModelSubComponent
import com.arsh.carselection.presentation.di.year.YearSubComponent

class App: Application(), Injector {
    private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
//        appComponent = DaggerAppComponent.builder()
//            .appModule(AppModule(applicationContext))
//            .netModule(NetModule(BuildConfig.BASE_URL))
//            .remoteDataModule(RemoteDataModule(BuildConfig.API_KEY, BuildConfig.page))
//            .build()
    }


    override fun createManufacturerSubComponent(): ManufacturerSubComponent {
        return appComponent.manufacturerSubComponent().create()
    }

    override fun createModelSubComponent(): ModelSubComponent {
        return appComponent.modelSubComponent().create()
    }

    override fun createYearSubCompoent(): YearSubComponent {
        return appComponent.yearSubComponent().create()
    }
}