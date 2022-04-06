package com.arsh.carselection.presentation.di

import com.arsh.carselection.presentation.di.manufacturer.ManufacturerSubComponent
import com.arsh.carselection.presentation.di.model.ModelSubComponent
import com.arsh.carselection.presentation.di.year.YearSubComponent

interface Injector  {

    fun createManufacturerSubComponent():ManufacturerSubComponent
    fun createModelSubComponent(): ModelSubComponent
    fun createYearSubCompoent(): YearSubComponent
}