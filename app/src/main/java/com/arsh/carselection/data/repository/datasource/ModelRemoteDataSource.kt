package com.arsh.carselection.data.repository.datasource

import com.arsh.carselection.data.model.manufacturer.Manufacturer
import com.arsh.carselection.data.model.models.Model
import retrofit2.Response

interface ModelRemoteDataSource {
    suspend fun getModels() : Response<Model>

}