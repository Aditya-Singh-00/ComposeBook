package com.aditya.composebook.youtube.ui.screen.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aditya.composebook.youtube.ui.theme.paddingMedium
import com.aditya.composebook.youtube.ui.theme.paddingSmall

@Composable
fun YoutubeIcon(
    @DrawableRes icon: Int,
    text: String? = null,
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
                painter = painterResource(id = icon),
                contentDescription = null
            )
        }
    }
}