package com.example.todolist_j

class TodoItem {
    var title = "Default"
    var checked = false

    constructor(Title: String, IsCheck: Boolean) {
        title = Title
        checked = IsCheck
    }

    fun title(): String = title
    fun checked(): Boolean = checked
}