package com.arvind.notewakeupcomposeapp.utils

import com.arvind.notewakeupcomposeapp.data.local.Note

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
