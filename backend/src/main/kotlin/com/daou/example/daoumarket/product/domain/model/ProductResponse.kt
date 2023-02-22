package com.daou.example.daoumarket.product.domain.model

import com.daou.example.daoumarket.product.domain.Product
import io.swagger.v3.oas.annotations.media.Schema

@Schema(description = "상품 리스트 응답 모델")
class ProductResponse(
    @Schema(description = "상품 코드", example = "898220013302")
    var code: String,
    @Schema(description = "제조사", example = "캘리포니아 골드 뉴트리션")
    var brand: String,
    @Schema(description = "상품명")
    var name: String,
    @Schema(description = "상품 설명 요약")
    var summary: String,
    @Schema(description = "용량")
    var inventory: Int,
    @Schema(description = "가격")
    var price: Long,
    @Schema(description = "상품 설명")
    var content: String,
    @Schema(description = "이미지 URL, android f_auto,q_auto:eco 제거후 사용", example = "https://cloudinary.images-iherb.com/image/upload/f_auto,q_auto:eco/images/cgn/cgn01330/l/117.jpg")
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