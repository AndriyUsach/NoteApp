package com.andriycube1404.notes.feature_note.domain.use_case

import com.andriycube1404.notes.feature_note.domain.model.Note
import com.andriycube1404.notes.feature_note.domain.repository.NoteRepository

class GetNote(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }
}