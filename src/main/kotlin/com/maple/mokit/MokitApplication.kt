package com.maple.mokit

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class MokitApplication

fun main(args: Array<String>) {
    SpringApplication.run(MokitApplication::class.java, *args)
}
