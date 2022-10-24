package com.arvind.notewakeupcomposeapp.usecase

import com.arvind.notewakeupcomposeapp.data.local.Note
import com.arvind.notewakeupcomposeapp.data.repository.NoteRepository

class GetNote(private val noteRepository: NoteRepository) {
    suspend operator fun invoke(id: Int): Note? {
        return noteRepository.getNoteById(id)
    }
}