package com.aditya.composebook.twitter.ui.screen.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.aditya.composebook.twitter.R
import com.aditya.composebook.twitter.ui.theme.LightGray
import com.aditya.composebook.twitter.ui.theme.paddingMedium
import com.aditya.composebook.twitter.ui.theme.paddingSmall


@Composable
fun TopBanner(
    profileImage: Int = R.drawable.profile,
    logo: Int = R.drawable.twitter_blue,
    icon: Int = R.drawable.twitter_top_right_icon
) {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(paddingMedium)
                .height(40.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Image(
                painter = painterResource(id = profileImage),
                contentDescription = null,
                modifier = Modifier
                    .size(40.dp)
                    .padding(paddingSmall)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
            )
            Image(
                painter = painterResource(id = logo),
                contentDescription = null
            )
            Image(
                painter = painterResource(id = icon),
                contentDescription = null
            )
        }
        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .height((0.25).dp)
                .background(LightGray)
        )
    }
}