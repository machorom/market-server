package com.daou.example.daoumarket

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@SpringBootApplication
@EnableJpaAuditing
class DaoumarketApplication

fun main(args: Array<String>) {
    runApplication<DaoumarketApplication>(*args)
}
