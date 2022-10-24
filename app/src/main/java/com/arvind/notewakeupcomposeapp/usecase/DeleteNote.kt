package com.arvind.notewakeupcomposeapp.usecase

import com.arvind.notewakeupcomposeapp.data.local.Note
import com.arvind.notewakeupcomposeapp.data.repository.NoteRepository

class DeleteNote(private val noteRepository: NoteRepository) {

    suspend operator fun invoke(note: Note) {
        noteRepository.deleteNote(note)
    }
}