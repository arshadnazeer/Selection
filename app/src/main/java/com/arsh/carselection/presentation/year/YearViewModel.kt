package com.arsh.carselection.presentation.manufacturer

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.arsh.carselection.domain.usecase.GetManufacturersUseCase
import com.arsh.carselection.domain.usecase.GetModelsUseCase
import com.arsh.carselection.domain.usecase.GetYearUseCase
import kotlinx.coroutines.yield

class YearViewModel(
    private val getYearUseCase: GetYearUseCase
) : ViewModel() {
    fun getYears() = liveData {
        val years = getYearUseCase.execute()
        emit(years)
    }
}