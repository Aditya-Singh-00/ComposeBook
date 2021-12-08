package com.aditya.composebook.youtube.ui.screen.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomAppBar
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.aditya.composebook.youtube.R
import com.aditya.composebook.youtube.ui.theme.paddingLarge

@Composable
fun BottomBar() {
    BottomAppBar(
        modifier = Modifier.fillMaxWidth(),
        contentColor = MaterialTheme.colors.onBackground,
        backgroundColor = MaterialTheme.colors.background
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = paddingLarge),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            YoutubeIcon(
                icon = R.drawable.ic_youtube_home,
                text = "Home",
                size = 40.dp
            )
            YoutubeIcon(
                icon = R.drawable.ic_youtube_shorts,
                text = "Shorts",
                size = 40.dp
            )
            YoutubeIcon(
                icon = R.drawable.ic_youtube_create,
                size = 50.dp
            )
            YoutubeIcon(
                icon = R.drawable.ic_youtube_subscription,
                text = "Subscriptions",
                size = 40.dp
            )
            YoutubeIcon(
                icon = R.drawable.ic_youtube_library,
                text = "Library",
                size = 40.dp
            )
        }
    }
}