package com.arsh.carselection.presentation.manufacturer

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.arsh.carselection.domain.usecase.GetModelsUseCase

class ModelViewModelFactory(
    private val getModelsUseCase: GetModelsUseCase
): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return ModelViewModel(getModelsUseCase) as T
    }
}