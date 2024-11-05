package com.mobizone.todoapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication

@SpringBootApplication
@EntityScan(basePackages = ["com.mobizone.todoapp.core.model"])
class TodoappApplication

fun main(args: Array<String>) {
	runApplication<TodoappApplication>(*args)
}
