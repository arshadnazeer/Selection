package com.arsh.carselection.domain.repository

import com.arsh.carselection.data.model.manufacturer.Manufacturer

interface ManufacturerRepository {
    suspend fun getManufacturers():List<Manufacturer>?
}