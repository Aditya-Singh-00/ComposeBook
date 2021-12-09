package com.aditya.composebook.youtube.ui.screen.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Cast
import androidx.compose.material.icons.filled.NotificationsNone
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aditya.composebook.youtube.R
import com.aditya.composebook.youtube.ui.theme.paddingMedium

@Composable
fun TopBar(
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = R.drawable.youtube),
            contentDescription = null,
            modifier = Modifier
                .padding(start = paddingMedium)
                .size(35.dp)
        )
        Text(
            text = "YouTube",
            modifier = Modifier.padding(start = paddingMedium),
            fontSize = 18.sp
        )
        Box(
            modifier = Modifier.fillMaxWidth()
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(0.80f)
                    .align(Alignment.CenterEnd),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                YoutubeIcon(
                    icon = Icons.Default.Cast,
                    size = 40.dp
                )
                YoutubeIcon(
                    icon = Icons.Default.NotificationsNone,
                    size = 40.dp
                )
                YoutubeIcon(
                    icon = Icons.Default.Search,
                    size = 40.dp
                )
                Image(
                    painter = painterResource(id = R.drawable.profile),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(end = paddingMedium)
                        .size(30.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop
                )
            }
        }
    }
}