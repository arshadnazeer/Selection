package com.arsh.carselection.domain.usecase

import com.arsh.carselection.data.model.manufacturer.Manufacturer
import com.arsh.carselection.domain.repository.ManufacturerRepository

class GetManufacturersUseCase(
    private val manufacturerRepository: ManufacturerRepository
) {
    suspend fun execute() : List<Manufacturer>? = manufacturerRepository.getManufacturers()
}