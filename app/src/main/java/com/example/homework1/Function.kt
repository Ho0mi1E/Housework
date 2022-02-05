package com.example.homework1

import android.app.Activity

fun sortByName(list: List<User>): List<User> {
    return list.sortedBy { User -> User.userName }

}

fun faceControl(list: List<User>): List<User> {
    return list.toMutableList().filter { User -> User.age >= 18 }
}


