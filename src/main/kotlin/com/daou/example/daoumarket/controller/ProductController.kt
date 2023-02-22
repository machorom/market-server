package com.daou.example.daoumarket.controller

import com.daou.example.daoumarket.domain.Product
import com.daou.example.daoumarket.repository.ProductRepository
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/product")
class ProductController(val productRepository: ProductRepository) {
    @GetMapping("/all")
    fun getProducts(): Page<Product> {
        val result = productRepository.findAll(PageRequest.of(0, 10))
        println("$result")
        return result
    }

    @GetMapping("/{productId}")
    fun getProduct(@PathVariable productId: Long):Product? {
        return productRepository.findProductById(productId)
    }
}