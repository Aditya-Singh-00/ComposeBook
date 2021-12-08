package com.aditya.composebook.twitter.ui.screen.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aditya.composebook.twitter.ui.theme.LightBlue
import com.aditya.composebook.twitter.ui.theme.paddingMedium

@Composable
fun TweetIcon(
    image: ImageVector,
    count: Int? = null
) {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            imageVector = image,
            contentDescription = null,
            colorFilter = ColorFilter.tint(LightBlue),
            modifier = Modifier.size(18.dp)
        )
        Spacer(modifier = Modifier.width(paddingMedium))
        count?.let {
            Text(
                text = it.toString(),
                color = LightBlue,
                fontSize = 14.sp
            )
        }
    }
}