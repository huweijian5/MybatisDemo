package com.example.demo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

//@MapperScan("com.example.demo.model.dao")//扫描包,如果加了此句则不用再写@Mapper
@SpringBootApplication
class DemoApplication

fun main(args: Array<String>) {
    SpringApplication.run(DemoApplication::class.java, *args)
}
