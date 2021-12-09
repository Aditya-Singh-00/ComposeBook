package com.aditya.composebook.youtube.ui.screen.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.aditya.composebook.youtube.ui.theme.paddingMedium

@Composable
fun YoutubeIcon(
    icon: ImageVector,
    size: Dp = 25.dp
) {
    Box(
        modifier = Modifier
            .size(size)
            .padding(paddingMedium)
    ) {
        Column(
            modifier = Modifier.align(Alignment.Center),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(
                imageVector = icon,
                contentDescription = null
            )
        }
    }
}