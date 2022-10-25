package com.arvind.notewakeupcomposeapp.navigation


sealed class Screen(val route: String) {
    object Splash : Screen("splash_screen")
    object NotesScreen: Screen("notes_screen")
    object AddEditNoteScreen: Screen("add_edit_note_screen")
}
