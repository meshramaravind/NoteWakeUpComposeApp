package com.arvind.notewakeupcomposeapp.utils

data class NoteTextFieldState(
    val text: String = "",
    val hint: String = "",
    val isHintVisible: Boolean = true
)