package com.mobizone.todoapp.core.usecase

import com.mobizone.todoapp.core.model.ToDo

interface CreateToDoUseCase {
    fun create(todo: ToDo): ToDo
}