package com.mobizone.todoapp.application.port

import com.mobizone.todoapp.core.model.ToDo

interface ToDoRepository {
    fun save(toDo: ToDo): ToDo
    fun findAll(): List<ToDo>
}