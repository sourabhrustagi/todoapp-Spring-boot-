package com.mobizone.todoapp.presentation.dto

import com.mobizone.todoapp.core.model.ToDo
import java.time.LocalDateTime

data class ToDoResponse(
    val id: Long?,
    val title: String,
    val description: String,
    val completed: Boolean,
    val createdAt: LocalDateTime
) {
    companion object {
        fun from(toDo: ToDo) = ToDoResponse(
            id = toDo.id,
            title = toDo.title,
            description = toDo.description,
            completed = toDo.completed,
            createdAt = toDo.createdAt
        )
    }
}