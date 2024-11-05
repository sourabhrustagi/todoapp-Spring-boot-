package com.mobizone.todoapp

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController {

    @GetMapping("/hello")
    fun sayHello(): String {
        return "Hello, World!"
    }
}