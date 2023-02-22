package com.daou.example.daoumarket.domain

import jakarta.persistence.*
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import java.time.LocalDateTime

@Entity
data class ProductOption(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    var name: String,
    var inventory: Int,
    var price: Long,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    var product: Product,

    @CreatedDate
    var createdAt: LocalDateTime,
    @LastModifiedDate
    var updatedAt: LocalDateTime,
)