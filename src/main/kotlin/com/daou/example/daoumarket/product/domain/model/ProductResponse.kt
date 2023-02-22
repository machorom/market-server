package com.daou.example.daoumarket.product.domain.model

import com.daou.example.daoumarket.product.domain.Product

class ProductResponse(
    var code: String,
    var brand: String,
    var name: String,
    var summary: String,
    var inventory: Int,
    var price: Long,
    var content: String,
    var imgUrl: String
) {
    companion object {
        fun of(product: Product): ProductResponse {
            return ProductResponse(
                product.code,
                product.brand,
                product.name,
                product.summary,
                product.inventory,
                product.price,
                product.content,
                product.imgUrl
            )
        }
    }

}