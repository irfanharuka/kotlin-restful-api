package com.irfanharuka.kotlinspringrest.controller

import com.irfanharuka.kotlinspringrest.entity.Product
import com.irfanharuka.kotlinspringrest.model.CreateProductRequest
import com.irfanharuka.kotlinspringrest.model.ProductResponse
import com.irfanharuka.kotlinspringrest.model.WebResponse
import com.irfanharuka.kotlinspringrest.service.ProductService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class ProductController(private val productService: ProductService) {

    @PostMapping(
            value = ["/api/products"],
            produces = ["application/json"],
            consumes = ["application/json"]
    )
    fun createProduct(@RequestBody createProductRequest: CreateProductRequest): WebResponse<ProductResponse> {
        val response = productService.create(createProductRequest)

        return WebResponse(
                code = 200,
                status = "Success",
                data = response
        )
    }
}