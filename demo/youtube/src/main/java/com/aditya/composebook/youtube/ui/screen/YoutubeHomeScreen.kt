package com.aditya.composebook.youtube.ui.screen

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.aditya.composebook.model.YoutubeVideo
import com.aditya.composebook.youtube.ui.screen.components.BottomBar
import com.aditya.composebook.youtube.ui.screen.components.Chip
import com.aditya.composebook.youtube.ui.screen.components.TopBar
import com.aditya.composebook.youtube.ui.screen.components.VideoPreview
import com.aditya.composebook.youtube.ui.screen.util.chips
import com.aditya.composebook.youtube.ui.screen.util.items
import com.aditya.composebook.youtube.ui.theme.paddingSmall

@Composable
fun YoutubeHomeScreen(
    videos: List<YoutubeVideo>
) {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = { TopBar() },
        bottomBar = { BottomBar(items) }
    ) {
        LazyColumn {
            item {
                LazyRow(
                    contentPadding = PaddingValues(paddingSmall)
                ) {
                    items(chips) { chip ->
                        Chip(text = chip)
                    }
                }
            }
            items(videos) { video ->
                VideoPreview(video = video)
            }
        }
    }
}