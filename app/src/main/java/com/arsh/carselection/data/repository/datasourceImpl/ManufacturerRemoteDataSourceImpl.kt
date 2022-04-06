package com.arsh.carselection.data.repository.datasourceImpl

import com.arsh.carselection.data.api.CarServiceInterface
import com.arsh.carselection.data.model.manufacturer.Manufacturer
import com.arsh.carselection.data.repository.datasource.ManufacturerRemoteDataSource
import retrofit2.Response

class ManufacturerRemoteDataSourceImpl(
    private val carServiceInterface: CarServiceInterface,
    private val apikey : String,
) : ManufacturerRemoteDataSource {
    override suspend fun getManufacturers(): Response<Manufacturer> {
        return carServiceInterface.getManufacturers(apikey)
    }
}