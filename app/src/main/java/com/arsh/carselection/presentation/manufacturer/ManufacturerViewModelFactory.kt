package com.arsh.carselection.presentation.manufacturer

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.arsh.carselection.domain.usecase.GetManufacturersUseCase

class ManufacturerViewModelFactory(
    private val getManufacturersUseCase: GetManufacturersUseCase
): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return ManufacturerViewModel(getManufacturersUseCase) as T
    }
}