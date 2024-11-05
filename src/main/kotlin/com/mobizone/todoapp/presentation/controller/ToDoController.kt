package com.mobizone.todoapp.presentation.controller

import com.mobizone.todoapp.application.service.ToDoService
import com.mobizone.todoapp.core.model.ToDo
import com.mobizone.todoapp.presentation.dto.ToDoRequest
import com.mobizone.todoapp.presentation.dto.ToDoResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/todos")
class ToDoController(private val toDoService: ToDoService) {
    @PostMapping
    fun createToDo(@RequestBody request: ToDoRequest): ToDoResponse {
        val toDo = ToDo(
            title = request.title,
            description = request.description
        )
        return ToDoResponse.from(toDoService.create(toDo))
    }

    @GetMapping
    fun getAllToDos(): List<ToDoResponse> {
        return toDoService.getAll().map { ToDoResponse.from(it) }
    }
}