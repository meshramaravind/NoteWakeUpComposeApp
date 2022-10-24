package com.arvind.notewakeupcomposeapp.utils

import com.arvind.notewakeupcomposeapp.data.local.Note

sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrder): NotesEvent()
    data class DeleteNote(val note: Note): NotesEvent()
    object RestoreNote: NotesEvent()
    object ToggleOrderSection: NotesEvent()
}
