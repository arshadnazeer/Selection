package com.arsh.carselection.presentation.di.manufacturer

import com.arsh.carselection.presentation.manufacturer.ManufacturerActivity
import dagger.Subcomponent

@ManufacturerScope
@Subcomponent(
    modules = [
        ManufacturerModule::class
    ]
)
interface ManufacturerSubComponent {
    fun inject(manufacturerActivity: ManufacturerActivity)

    @Subcomponent.Factory
    interface Factory{
        fun create() : ManufacturerSubComponent
    }
}