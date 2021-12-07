package com.aditya.composebook.twitter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.aditya.composebook.twitter.ui.screen.TwitterHomeScreen
import com.aditya.composebook.twitter.ui.theme.TwitterTheme

class TwitterActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TwitterTheme{
                TwitterHomeScreen()
            }
        }
    }
}
