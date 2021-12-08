package com.aditya.composebook.twitter.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aditya.composebook.model.Tweet
import com.aditya.composebook.twitter.ui.screen.components.BottomBar
import com.aditya.composebook.twitter.ui.screen.components.TopBar
import com.aditya.composebook.twitter.ui.screen.components.Tweet
import com.aditya.composebook.twitter.ui.theme.Blue

@Composable
fun TwitterHomeScreen(
    tweets: List<Tweet>
) {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = { TopBar() },
        bottomBar = { BottomBar() },
        floatingActionButton = {
            Box(
                modifier = Modifier
                    .size(60.dp)
                    .clip(CircleShape)
                    .background(Blue)
            ) {
                Text(
                    text = "+",
                    fontSize = 30.sp,
                    color = Color.White,
                    modifier = Modifier.align(Alignment.Center)
                )
            }
        }
    ) {
        LazyColumn {
            items(tweets) { tweet ->
                Tweet(tweet = tweet)
            }
            item {
                Spacer(modifier = Modifier.height(50.dp))
            }
        }
    }
}