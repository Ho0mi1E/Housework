package com.example.homework1

class User(val userName: String, val secondName: String, val age: String) {
    override fun toString(): String {
        return "Имя: $userName Фамилия: $secondName Возраст: $age " // что-то новое
    }
}