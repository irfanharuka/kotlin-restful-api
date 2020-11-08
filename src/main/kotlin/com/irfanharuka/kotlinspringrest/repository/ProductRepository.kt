package com.irfanharuka.kotlinspringrest.repository

import com.irfanharuka.kotlinspringrest.entity.Product
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository: JpaRepository<Product, String>