package com.irfanharuka.kotlinspringrest.service.impl

import com.irfanharuka.kotlinspringrest.entity.Product
import com.irfanharuka.kotlinspringrest.model.CreateProductRequest
import com.irfanharuka.kotlinspringrest.model.ProductResponse
import com.irfanharuka.kotlinspringrest.model.WebResponse
import com.irfanharuka.kotlinspringrest.repository.ProductRepository
import com.irfanharuka.kotlinspringrest.service.ProductService
import com.irfanharuka.kotlinspringrest.validation.ValidationUtil
import org.springframework.stereotype.Service
import java.util.*

@Service
class ProductServiceImpl(
        private val productRepository: ProductRepository,
        private val validationUtil: ValidationUtil
) : ProductService {
    override fun create(createProductRequest: CreateProductRequest): ProductResponse {
        validationUtil.validate(createProductRequest)

        val product = Product(
                id = createProductRequest.id!!,
                name = createProductRequest.name!!,
                price = createProductRequest.price!!,
                quantity = createProductRequest.quantity!!,
                createdAt = Date(),
                updatedAt = null
        )

        productRepository.save(product)

        return ProductResponse(
                id = product.id,
                name = product.name,
                price = product.price,
                quantity = product.quantity,
                createdAt = product.createdAt,
                updatedAt = product.updatedAt
        )
    }
}