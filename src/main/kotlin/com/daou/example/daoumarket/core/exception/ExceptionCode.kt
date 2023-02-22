package com.daou.example.daoumarket.core.exception

import org.springframework.http.HttpStatus

enum class ExceptionCode(
    val httpStatus: HttpStatus,
    val code: String,
    val message: String,
) {
    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "B001", "정의되지 않은 서버 에러"),
    NOT_FOUND(HttpStatus.BAD_REQUEST, "B002", "잘못된 요청"),
}