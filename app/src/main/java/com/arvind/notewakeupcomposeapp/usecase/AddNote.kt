package com.arvind.notewakeupcomposeapp.usecase

import com.arvind.notewakeupcomposeapp.data.local.InvalidNoteException
import com.arvind.notewakeupcomposeapp.data.local.Note
import com.arvind.notewakeupcomposeapp.data.repository.NoteRepository

class AddNote(private val noteRepository: NoteRepository) {
    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if (note.title.isBlank()) {
            throw InvalidNoteException("The title of the note can't be empty.")
        }
        if (note.content.isBlank()) {
            throw InvalidNoteException("The content of the note can't be empty.")
        }
        noteRepository.insertNote(note)
    }
}