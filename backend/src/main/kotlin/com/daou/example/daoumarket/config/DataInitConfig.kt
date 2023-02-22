package com.daou.example.daoumarket.config

import com.daou.example.daoumarket.product.repository.ProductRepository
import org.springframework.boot.ApplicationRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class DataInitConfig {
    @Bean
    fun databaseInitializer(productRepository: ProductRepository) = ApplicationRunner {

//        val jdoe = userRepository.save(User("jdoe", "John", "Doe"))
//        articleRepository.save(Article(
//            title = "Lorem ipsum",
//            headline = "Lorem ipsum",
//            content = "dolor sit amet",
//            author = jdoe
//        ))
    }
}