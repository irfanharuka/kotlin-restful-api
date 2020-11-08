package com.irfanharuka.kotlinspringrest.service

import com.irfanharuka.kotlinspringrest.model.CreateProductRequest
import com.irfanharuka.kotlinspringrest.model.ProductResponse
import com.irfanharuka.kotlinspringrest.model.WebResponse

interface ProductService {

    fun create(createProductRequest: CreateProductRequest): ProductResponse
}