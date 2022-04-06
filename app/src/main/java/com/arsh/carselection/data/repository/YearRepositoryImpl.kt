package com.arsh.carselection.data.repository

import android.util.Log
import com.arsh.carselection.data.model.manufacturer.Manufacturer
import com.arsh.carselection.data.model.models.Model
import com.arsh.carselection.data.model.year.Year
import com.arsh.carselection.data.repository.datasource.ManufacturerRemoteDataSource
import com.arsh.carselection.data.repository.datasource.ModelRemoteDataSource
import com.arsh.carselection.data.repository.datasource.YearRemoteDataSource
import com.arsh.carselection.domain.repository.ManufacturerRepository
import com.arsh.carselection.domain.repository.ModelRepository
import com.arsh.carselection.domain.repository.YearRepository
import java.lang.Exception

class YearRepositoryImpl(
    private val yearRemoteDataSource: YearRemoteDataSource
) : YearRepository {

    override suspend fun getYear(): List<Year>? {
        TODO("Not yet implemented")
    }


    suspend fun getYearsFromAPI() : List<Year>{
        lateinit var yearList: List<Year>
        try {
            val response = yearRemoteDataSource.getYear()
            val body = response.body()
            if (body!=null){
//                manufacturerList = body.page
            }

        }catch (exception: Exception){
            Log.e("MyTag",exception.message.toString())
        }

        return yearList
    }
}