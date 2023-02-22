package com.daou.example.daoumarket.product.domain.model

import com.daou.example.daoumarket.core.exception.ExceptionCode
import com.daou.example.daoumarket.core.exception.WebException
import com.daou.example.daoumarket.product.domain.AdditionalProduct
import com.daou.example.daoumarket.product.domain.Product
import com.daou.example.daoumarket.product.domain.ProductOption

class ProductDetailResponse(
    var code: String,
    var brand: String,
    var name: String,
    var summary: String,
    var inventory: Int,
    var price: Long,
    var content: String,
    var imgUrl: String,
    var productOptions: List<ProductOption>,
    var additionalProducts: List<AdditionalProduct>,
) {
    companion object {
        fun of(product: Product?): ProductDetailResponse {
            return product?.let { _product ->
                ProductDetailResponse(
                    _product.code,
                    _product.brand,
                    _product.name,
                    _product.summary,
                    _product.inventory,
                    _product.price,
                    _product.content,
                    _product.imgUrl,
                    _product.productOptions,
                    _product.additionalProducts
                )
            } ?: throw WebException(ExceptionCode.NOT_FOUND, "요청하신 상품의 데이터가 존재하지 않습니다.")
        }
    }
}