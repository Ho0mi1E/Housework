package com.example.homework1

fun sortByName(list: List<User>) = list.sortedBy { User -> User.userName }

fun faceControl(list: List<User>) = list.filter { User -> User.age >= 18 }