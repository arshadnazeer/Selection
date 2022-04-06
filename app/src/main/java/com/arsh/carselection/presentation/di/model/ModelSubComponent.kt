package com.arsh.carselection.presentation.di.model

import com.arsh.carselection.presentation.manufacturer.ManufacturerActivity
import com.arsh.carselection.presentation.model.ModelActivity
import dagger.Subcomponent

@ModelScope
@Subcomponent(
    modules = [
        ModelModule::class
    ]
)
interface ModelSubComponent {
    fun inject(modelActivity: ModelActivity)

    @Subcomponent.Factory
    interface Factory{
        fun create() : ModelSubComponent
    }
}