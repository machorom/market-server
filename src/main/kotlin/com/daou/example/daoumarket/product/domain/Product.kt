package com.daou.example.daoumarket.product.domain

import com.daou.example.daoumarket.core.domain.BaseEntity
import com.fasterxml.jackson.annotation.JsonBackReference
import jakarta.persistence.Entity
import jakarta.persistence.Lob
import jakarta.persistence.OneToMany

@Entity
class Product(
    var code: String,
    var brand: String,
    var name: String,
    var summary: String,
    var inventory: Int,
    var price: Long,
    @Lob
    var content: String,
    var imgUrl: String,

    @JsonBackReference
    @OneToMany(mappedBy = "product")
    var productOptions: List<ProductOption>,

    @JsonBackReference
    @OneToMany(mappedBy = "product")
    var additionalProducts: List<AdditionalProduct>,
) : BaseEntity()