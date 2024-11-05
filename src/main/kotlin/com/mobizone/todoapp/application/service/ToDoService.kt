package com.mobizone.todoapp.application.service

import com.mobizone.todoapp.core.usecase.CreateToDoUseCase
import com.mobizone.todoapp.core.usecase.GetToDosUseCase

interface ToDoService : CreateToDoUseCase, GetToDosUseCase