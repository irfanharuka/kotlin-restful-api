package com.irfanharuka.kotlinspringrest.model

import java.util.*

data class ProductResponse(
        val id: String,
        val name: String,
        val price: Long,
        val quantity: Int,
        val updatedAt: Date?,
        val createdAt: Date
)