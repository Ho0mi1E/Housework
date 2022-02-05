package com.example.homework1

import android.app.Activity

fun Activity.sortByName(list: List<User>): List<User> {
    return list.sortedBy { it.userName }

}

fun Activity.faceControl(list: List<User>): List<User> {
    val newList = list.toMutableList()
    newList.removeAll { it.age < 18 }
    return newList
}


