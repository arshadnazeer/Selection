package com.arsh.carselection.data.repository.datasourceImpl

import com.arsh.carselection.data.api.CarServiceInterface
import com.arsh.carselection.data.model.manufacturer.Manufacturer
import com.arsh.carselection.data.model.models.Model
import com.arsh.carselection.data.repository.datasource.ModelRemoteDataSource
import retrofit2.Response

class ModelremoteDataSourceImpl(
    private val carServiceInterface: CarServiceInterface,
    private val apikey : String,
    private val manufacturer : Int,
    ) : ModelRemoteDataSource {

    override suspend fun getModels(): Response<Model> {
        return carServiceInterface.getModels(apikey,manufacturer)
    }
}