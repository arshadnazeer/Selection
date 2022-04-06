package com.arsh.carselection.presentation.di.year

import com.arsh.carselection.presentation.manufacturer.ManufacturerActivity
import com.arsh.carselection.presentation.model.ModelActivity
import com.arsh.carselection.presentation.year.YearActivity
import dagger.Subcomponent

@YearScope
@Subcomponent(
    modules = [
        YearModule::class
    ]
)
interface YearSubComponent {
    fun inject(yearActivity: YearActivity)

    @Subcomponent.Factory
    interface Factory{
        fun create() : YearSubComponent
    }
}