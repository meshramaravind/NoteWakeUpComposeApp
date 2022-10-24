package com.arvind.notewakeupcomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.animation.ExperimentalAnimationApi
import com.arvind.notewakeupcomposeapp.navigation.AppNavHost
import com.arvind.notewakeupcomposeapp.ui.theme.NoteWakeUpComposeAppTheme
import com.arvind.notewakeupcomposeapp.viewmodel.AddEditNoteViewModel
import com.arvind.notewakeupcomposeapp.viewmodel.NotesViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            NoteWakeUpComposeAppTheme {
                AppNavHost()
            }
        }
    }
}

