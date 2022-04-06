package com.arsh.carselection.domain.repository

import com.arsh.carselection.data.model.models.Model
import com.arsh.carselection.data.model.year.Year

interface YearRepository {
    suspend fun getYear() : List<Year>?
}