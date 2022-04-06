package com.arsh.carselection.presentation.manufacturer

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.arsh.carselection.domain.usecase.GetManufacturersUseCase
import com.arsh.carselection.domain.usecase.GetModelsUseCase

class ModelViewModel(
    private val getModelsUseCase: GetModelsUseCase
) : ViewModel() {
    fun getModels() = liveData {
        val models = getModelsUseCase.execute()
        emit(models)
    }
}