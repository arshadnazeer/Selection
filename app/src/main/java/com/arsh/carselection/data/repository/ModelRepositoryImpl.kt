package com.arsh.carselection.data.repository

import android.util.Log
import com.arsh.carselection.data.model.manufacturer.Manufacturer
import com.arsh.carselection.data.model.models.Model
import com.arsh.carselection.data.repository.datasource.ManufacturerRemoteDataSource
import com.arsh.carselection.data.repository.datasource.ModelRemoteDataSource
import com.arsh.carselection.domain.repository.ManufacturerRepository
import com.arsh.carselection.domain.repository.ModelRepository
import java.lang.Exception

class ModelRepositoryImpl(
    private val modelRemoteDataSource: ModelRemoteDataSource
) : ModelRepository {

    override suspend fun getModels(): List<Model>? {
        TODO("Not yet implemented")
    }


    suspend fun getModelsFromAPI() : List<Model>{
        lateinit var modelList: List<Model>
        try {
            val response = modelRemoteDataSource.getModels()
            val body = response.body()
            if (body!=null){
//                manufacturerList = body.page
            }

        }catch (exception: Exception){
            Log.e("MyTag",exception.message.toString())
        }

        return modelList
    }
}