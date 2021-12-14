package com.aditya.composebook.twitter.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
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
        val scrollState = rememberScrollState()
        Column(
            modifier = Modifier.verticalScroll(
                state = scrollState
            )
        ) {
            tweets.forEach { Tweet(it) }
            Spacer(modifier = Modifier.height(50.dp))
        }
    }
}