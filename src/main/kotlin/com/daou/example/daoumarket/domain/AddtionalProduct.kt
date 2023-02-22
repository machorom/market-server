package com.daou.example.daoumarket.domain

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