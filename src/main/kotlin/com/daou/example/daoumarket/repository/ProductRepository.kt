package com.daou.example.daoumarket.repository

import com.daou.example.daoumarket.domain.Product
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository : JpaRepository<Product, Long> {
    fun findProductById(id: Long): Product?
}