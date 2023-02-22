package com.daou.example.daoumarket.controller

import com.daou.example.daoumarket.domain.Product
import com.daou.example.daoumarket.repository.ProductRepository
import io.swagger.v3.oas.annotations.Operation
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api/product")
class ProductController(val productRepository: ProductRepository) {

    @Operation(summary = "상품 목록 조회", description = "전체 상품 목록을 조회합니다.")
    @GetMapping("/all")
    fun getProducts(): Page<Product> {
        val result = productRepository.findAll(PageRequest.of(0, 10))
        println("$result")
        return result
    }

    @Operation(summary = "상품 상세", description = "상품 상세 내용을 조회합니다.")
    @GetMapping("/{productId}")
    fun getProduct(@PathVariable productId: Long): Product? {
        return productRepository.findProductById(productId)
    }
}