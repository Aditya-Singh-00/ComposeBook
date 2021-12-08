package com.aditya.composebook.twitter.ui.screen.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp.Companion.Hairline
import androidx.compose.ui.unit.dp
import com.aditya.composebook.twitter.R
import com.aditya.composebook.twitter.ui.theme.LightBlue
import com.aditya.composebook.twitter.ui.theme.paddingMedium

@Composable
fun TopBar(
    profileImage: Int = R.drawable.profile,
    logo: Int = R.drawable.twitter_blue,
    icon: Int = R.drawable.ic_twitter_top_right_icon
) {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        TopAppBar(
            modifier = Modifier.fillMaxWidth(),
            backgroundColor = MaterialTheme.colors.background,
            contentColor = MaterialTheme.colors.onBackground
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Image(
                    painter = painterResource(id = profileImage),
                    contentDescription = null,
                    modifier = Modifier
                        .size(40.dp)
                        .padding(paddingMedium)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop
                )
                Image(
                    painter = painterResource(id = logo),
                    contentDescription = null,
                    modifier = Modifier.size(40.dp)
                )
                Icon(
                    painter = painterResource(id = icon),
                    contentDescription = null,
                    tint = MaterialTheme.colors.onBackground,
                    modifier = Modifier.size(40.dp)
                )
            }
        }
        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .height(Hairline)
                .background(LightBlue)
        )
    }
}