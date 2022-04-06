package com.arsh.carselection.data.repository.datasource

import com.arsh.carselection.data.model.manufacturer.Manufacturer
import com.arsh.carselection.data.model.year.Year
import retrofit2.Response

interface YearRemoteDataSource {
    suspend fun getYear() : Response<Year>

}