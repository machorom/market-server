package com.daou.example.daoumarket.domain

import com.fasterxml.jackson.annotation.JsonBackReference
import jakarta.persistence.*
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import java.time.LocalDateTime

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