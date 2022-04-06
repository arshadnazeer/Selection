package com.arsh.carselection.domain.usecase

import com.arsh.carselection.data.model.year.Year
import com.arsh.carselection.domain.repository.YearRepository

class GetYearUseCase(
    private val yearRepository: YearRepository
) {
    suspend fun execute() : List<Year>? =  yearRepository.getYear()
}