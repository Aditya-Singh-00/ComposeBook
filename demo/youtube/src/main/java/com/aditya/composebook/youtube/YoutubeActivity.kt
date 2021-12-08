package com.aditya.composebook.youtube

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.remember
import com.aditya.composebook.DataProvider
import com.aditya.composebook.youtube.ui.screen.YoutubeHomeScreen
import com.aditya.composebook.youtube.ui.theme.YoutubeTheme

class YoutubeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            YoutubeTheme {
                val videos = remember { DataProvider().getYoutubeVideos() }
                YoutubeHomeScreen(videos = videos)
            }
        }
    }
}
