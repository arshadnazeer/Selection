package com.arsh.carselection.data.repository

import android.util.Log
import com.arsh.carselection.data.model.manufacturer.Manufacturer
import com.arsh.carselection.data.repository.datasource.ManufacturerRemoteDataSource
import com.arsh.carselection.domain.repository.ManufacturerRepository
import java.lang.Exception

class ManufacturerRepositoryImpl(
    private val manufacturerRemoteDataSource: ManufacturerRemoteDataSource
) : ManufacturerRepository {
    override suspend fun getManufacturers(): List<Manufacturer>? {
        return getManufacturersFromAPI()
    }

    suspend fun getManufacturersFromAPI() : List<Manufacturer>{
        lateinit var manufacturerList: List<Manufacturer>
        try {
            val response = manufacturerRemoteDataSource.getManufacturers()
            val body = response.body()
            if (body!=null){
//                manufacturerList = body.page
            }

        }catch (exception: Exception){
            Log.e("MyTag",exception.message.toString())
        }

        return manufacturerList
    }
}