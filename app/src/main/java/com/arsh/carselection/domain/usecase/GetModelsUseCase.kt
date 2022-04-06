package com.arsh.carselection.domain.usecase

import com.arsh.carselection.data.model.models.Model
import com.arsh.carselection.domain.repository.ModelRepository

class GetModelsUseCase(
    private val modelRepository: ModelRepository
) {
    suspend fun execute() : List<Model>? =  modelRepository.getModels()
}