package com.mobizone.todoapp.application.service

import com.mobizone.todoapp.application.port.ToDoRepository
import com.mobizone.todoapp.core.model.ToDo
import org.springframework.stereotype.Service

@Service
class ToDoServiceImpl(private val toDoRepository: ToDoRepository): ToDoService {
    override fun create(todo: ToDo): ToDo  = toDoRepository.save(todo)

    override fun getAll(): List<ToDo> = toDoRepository.findAll()
}