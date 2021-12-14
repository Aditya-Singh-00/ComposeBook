package com.aditya.composebook.gmail

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import com.aditya.composebook.gmail.data.mails
import com.aditya.composebook.gmail.ui.screen.HomeScreen

class GmailActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val mails = remember { mutableStateOf(mails) }
            HomeScreen(mails.value)
        }
    }
}
