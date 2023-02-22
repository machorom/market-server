package com.daou.example.daoumarket.product.service

import com.daou.example.daoumarket.product.domain.model.ProductDetail
import com.daou.example.daoumarket.product.domain.model.ProductResponse
import com.daou.example.daoumarket.product.repository.ProductRepository
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service

@Service
class ProductService(val productRepository: ProductRepository) {
    fun getProducts(pageable: Pageable): Page<ProductResponse> {
        val result = productRepository.findAll(pageable).map {
            ProductResponse.of(it)
        }
        return result
    }

    fun getProductDetail(id:Long): ProductDetail {
        return ProductDetail.of(productRepository.findProductById(id))
    }

}
