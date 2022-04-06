package com.arsh.carselection.presentation.di.core

import android.content.Context
import com.arsh.carselection.presentation.di.manufacturer.ManufacturerSubComponent
import com.arsh.carselection.presentation.di.model.ModelSubComponent
import com.arsh.carselection.presentation.di.year.YearSubComponent
import com.arsh.carselection.presentation.year.YearActivity
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(subcomponents = [ManufacturerSubComponent::class,ModelSubComponent::class,YearSubComponent::class])
class AppModule(
    private val context: Context
) {
    @Singleton
    @Provides
    fun provideApplicationContext():Context{
        return context.applicationContext
    }
}