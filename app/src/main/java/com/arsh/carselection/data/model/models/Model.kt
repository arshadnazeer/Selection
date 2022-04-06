package com.arsh.carselection.data.model.models


import com.google.gson.annotations.SerializedName

data class Model(
    @SerializedName("page")
    val page: Int,
    @SerializedName("pageSize")
    val pageSize: Int,
    @SerializedName("totalPageCount")
    val totalPageCount: Int,
    @SerializedName("wkda")
    val wkda: Wkda
)