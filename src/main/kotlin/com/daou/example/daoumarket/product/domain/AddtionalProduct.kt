package com.daou.example.daoumarket.product.domain

import com.daou.example.daoumarket.core.domain.BaseEntity
import jakarta.persistence.Entity
import jakarta.persistence.FetchType
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne

@Entity
class AdditionalProduct(
    var addName: String,
    var inventory: Int,
    var price: Long,
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    var product: Product
) : BaseEntity()