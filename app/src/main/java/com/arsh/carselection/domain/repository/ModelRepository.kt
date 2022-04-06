package com.arsh.carselection.domain.repository

import com.arsh.carselection.data.model.models.Model

interface ModelRepository {
    suspend fun getModels() : List<Model>?
}