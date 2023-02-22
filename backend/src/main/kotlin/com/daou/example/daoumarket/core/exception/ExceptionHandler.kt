package com.daou.example.daoumarket.core.exception

import com.daou.example.daoumarket.core.domain.ResponseErrorModel
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class ExceptionHandler {
    @ExceptionHandler(value = [WebException::class])
    fun handleWebException(e: WebException): ResponseEntity<ResponseErrorModel> {
        return ResponseEntity.status(e.httpStatus)
            .body(ResponseErrorModel(e.httpStatus, e.serverMsg, e.clientMsg))
    }
}