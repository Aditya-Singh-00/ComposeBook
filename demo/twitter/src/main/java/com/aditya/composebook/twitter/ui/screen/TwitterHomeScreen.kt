package com.aditya.composebook.twitter.ui.screen

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.ExtendedFloatingActionButton
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aditya.composebook.model.Tweet
import com.aditya.composebook.twitter.ui.screen.components.BottomBar
import com.aditya.composebook.twitter.ui.screen.components.TopBar
import com.aditya.composebook.twitter.ui.screen.components.Tweet

@Composable
fun TwitterHomeScreen(
    tweets: List<Tweet>
) {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = { TopBar() },
        bottomBar = { BottomBar() },
        floatingActionButton = {
            ExtendedFloatingActionButton(
                text = {
                    Text(
                        text = "+",
                        fontSize = 30.sp,
                        color = Color.White,
                    )
                },
                onClick = { }
            )
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