package com.daou.example.daoumarket.product.controller

import com.daou.example.daoumarket.product.domain.Product
import com.daou.example.daoumarket.product.domain.model.ProductDetail
import com.daou.example.daoumarket.product.domain.model.ProductResponse
import com.daou.example.daoumarket.product.repository.ProductRepository
import com.daou.example.daoumarket.product.service.ProductService
import io.swagger.v3.oas.annotations.Operation
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.data.web.PageableDefault
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api/product")
class ProductController(val productService: ProductService) {

    @Operation(summary = "상품 목록 조회", description = "전체 상품 목록을 조회합니다.")
    @GetMapping("/all")
    fun getProducts(
        @PageableDefault(
            sort = ["id"],
            direction = Sort.Direction.ASC
        ) pageable: Pageable
    ): Page<ProductResponse> {
        return productService.getProducts(pageable)
    }

    @Operation(summary = "상품 상세", description = "상품 상세 내용을 조회합니다.")
    @GetMapping("/{productId}")
    fun getProduct(@PathVariable productId: Long): ProductDetail {
        return productService.getProductDetail(productId)
    }
}