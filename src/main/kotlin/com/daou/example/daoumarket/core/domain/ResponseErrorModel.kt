package com.daou.example.daoumarket.core.domain

import org.springframework.http.HttpStatus

class ResponseErrorModel(
    val status: HttpStatus,
    val errorCode: String?,
    val message: String?
)