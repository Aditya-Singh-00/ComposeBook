package com.aditya.composebook.youtube.ui.screen.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.aditya.composebook.model.YoutubeVideo
import com.aditya.composebook.youtube.ui.theme.LightGray
import com.aditya.composebook.youtube.ui.theme.paddingLarge
import com.aditya.composebook.youtube.ui.theme.paddingMedium
import com.aditya.composebook.youtube.ui.theme.paddingSmall

@Composable
fun VideoPreview(
    video: YoutubeVideo
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = paddingLarge)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),
            ) {
            Image(
                painter = painterResource(id = video.preview),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp),
                contentScale = ContentScale.Crop
            )
            Box(
                modifier = Modifier
                    .padding(paddingMedium)
                    .background(color = Color.Black)
                    .padding(horizontal = paddingSmall)
                    .align(Alignment.BottomEnd)
            ) {
                Text(
                    text = video.duration,
                    style = MaterialTheme.typography.body2
                )
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(paddingSmall),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = video.channelProfile),
                contentDescription = null,
                modifier = Modifier
                    .size(55.dp)
                    .padding(paddingMedium)
                    .clip(CircleShape),
                contentScale = ContentScale.Inside
            )
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(paddingSmall)
            ) {
                Column(
                    modifier = Modifier.padding(horizontal = paddingSmall)
                ) {
                    Text(
                        text = video.title,
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis
                    )
                    Row {
                        Text(
                            text = video.channelName,
                            style = MaterialTheme.typography.body2,
                            color = LightGray
                        )
                        Text(
                            text = " . ${video.views}",
                            style = MaterialTheme.typography.body2,
                            color = LightGray
                        )
                        Text(
                            text = " . ${video.timesAgo}",
                            style = MaterialTheme.typography.body2,
                            color = LightGray
                        )
                    }
                }
                Icon(
                    imageVector = Icons.Default.MoreVert,
                    contentDescription = null,
                    modifier = Modifier
                        .size(25.dp)
                        .padding(top = paddingSmall)
                        .align(Alignment.TopEnd)
                )
            }
        }
    }
}