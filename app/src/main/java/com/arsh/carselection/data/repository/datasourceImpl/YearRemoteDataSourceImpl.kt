package com.arsh.carselection.data.repository.datasourceImpl

import com.arsh.carselection.data.api.CarServiceInterface
import com.arsh.carselection.data.model.year.Year
import com.arsh.carselection.data.repository.datasource.YearRemoteDataSource
import retrofit2.Response

class YearRemoteDataSourceImpl(
    private val carServiceInterface: CarServiceInterface,
    private val apiKey: String,
    private val manufacturer : Int,
    private val mainType: String
) : YearRemoteDataSource {
    override suspend fun getYear(): Response<Year> {
        return carServiceInterface.getYear(apiKey,manufacturer,mainType)
    }
}