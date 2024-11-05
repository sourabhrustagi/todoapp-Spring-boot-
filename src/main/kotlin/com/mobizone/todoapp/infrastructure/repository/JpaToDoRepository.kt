package com.mobizone.todoapp.infrastructure.repository

import com.mobizone.todoapp.application.port.ToDoRepository
import com.mobizone.todoapp.core.model.ToDo
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface JpaToDoRepository : JpaRepository<ToDo, Long>, ToDoRepository