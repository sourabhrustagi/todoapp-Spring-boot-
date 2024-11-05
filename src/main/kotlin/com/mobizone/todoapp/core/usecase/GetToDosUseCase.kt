package com.mobizone.todoapp.core.usecase

import com.mobizone.todoapp.core.model.ToDo

interface GetToDosUseCase {
    fun getAll(): List<ToDo>
}