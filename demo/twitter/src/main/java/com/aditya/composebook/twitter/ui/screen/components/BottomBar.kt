package com.aditya.composebook.twitter.ui.screen.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.aditya.composebook.twitter.R
import com.aditya.composebook.twitter.ui.theme.LightGray

@Composable
fun BottomBar() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(55.dp)
            .background(Color.White)
    ) {
        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .height((0.25).dp)
                .background(LightGray)
        )
        Image(
            painter = painterResource(id = R.drawable.twitter_bottom_nav),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
        )
    }
}