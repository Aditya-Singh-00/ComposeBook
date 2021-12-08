package com.aditya.composebook.twitter.ui.screen.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.BottomAppBar
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp.Companion.Hairline
import androidx.compose.ui.unit.dp
import com.aditya.composebook.twitter.R
import com.aditya.composebook.twitter.ui.theme.LightBlue
import com.aditya.composebook.twitter.ui.theme.paddingLarge

@Composable
fun BottomBar() {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .height(Hairline)
                .background(LightBlue)
        )
        BottomAppBar(
            modifier = Modifier.fillMaxWidth(),
            backgroundColor = MaterialTheme.colors.background,
            contentColor = MaterialTheme.colors.onBackground,
            contentPadding = PaddingValues(horizontal = paddingLarge)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = paddingLarge),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_twitterhome),
                    contentDescription = null,
                    tint = MaterialTheme.colors.onBackground,
                    modifier = Modifier
                        .size(30.dp)
                        .clickable {  }
                )
                Icon(
                    painter = painterResource(id = R.drawable.ic_twittersearch),
                    contentDescription = null,
                    tint = MaterialTheme.colors.onBackground,
                    modifier = Modifier
                        .size(30.dp)
                        .clickable {  }
                )
                Icon(
                    painter = painterResource(id = R.drawable.ic_twitterbell),
                    contentDescription = null,
                    tint = MaterialTheme.colors.onBackground,
                    modifier = Modifier
                        .size(30.dp)
                        .clickable {  }
                )
                Icon(
                    painter = painterResource(id = R.drawable.ic_twittermessage),
                    contentDescription = null,
                    tint = MaterialTheme.colors.onBackground,
                    modifier = Modifier
                        .size(30.dp)
                        .clickable {  }
                )
            }
        }
    }
}