package com.mobizone.todoapp.core.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.time.LocalDateTime

@Entity
data class ToDo(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val title: String,
    val description: String,
    val completed: Boolean = false,
    val createdAt: LocalDateTime = LocalDateTime.now()
)