package com.arsh.carselection.presentation.manufacturer

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.arsh.carselection.domain.usecase.GetManufacturersUseCase

class ManufacturerViewModel(
    private val getManufacturersUseCase: GetManufacturersUseCase
) : ViewModel() {
    fun getManufacturers() = liveData {
        val manufacturers = getManufacturersUseCase.execute()
        emit(manufacturers)
    }
}