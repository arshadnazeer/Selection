package com.arsh.carselection.data.repository.datasource

import com.arsh.carselection.data.model.manufacturer.Manufacturer
import retrofit2.Response

interface ManufacturerRemoteDataSource {
    suspend fun getManufacturers() : Response<Manufacturer>
}