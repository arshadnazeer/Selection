package com.arsh.carselection.presentation.manufacturer

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.arsh.carselection.domain.usecase.GetModelsUseCase
import com.arsh.carselection.domain.usecase.GetYearUseCase

class YearViewModelFactory(
    private val getYearUseCase: GetYearUseCase
): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return YearViewModel(getYearUseCase) as T
    }
}