package com.example.todopractice.repository.todo

interface ToDoRepository {
    suspend fun create(title: String, detail: String)
}