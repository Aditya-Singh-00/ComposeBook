package com.aditya.composebook.twitter.ui.screen.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.ModeComment
import androidx.compose.material.icons.outlined.Repeat
import androidx.compose.material.icons.outlined.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.aditya.composebook.model.Tweet
import com.aditya.composebook.twitter.R
import com.aditya.composebook.twitter.ui.theme.*

@Composable
fun Tweet(
    tweet: Tweet
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(paddingMedium)
    ) {
        Image(
            painter = painterResource(id = tweet.userProfile),
            contentDescription = null,
            modifier = Modifier
                .size(50.dp)
                .padding(paddingMedium)
                .clip(CircleShape),
            contentScale = ContentScale.Inside
        )
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = paddingMedium)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = tweet.userName,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.width(paddingSmall))
                Image(
                    painter = painterResource(id = R.drawable.verified),
                    contentDescription = null,
                    modifier = Modifier
                        .size(16.dp)
                        .align(Alignment.CenterVertically)
                )
                Spacer(modifier = Modifier.width(paddingSmall))
                Text(
                    text = tweet.userId,
                    color = Gray
                )
                Spacer(modifier = Modifier.width(paddingSmall))
                Text(
                    text = ". ${tweet.tweetTime}",
                    color = Gray
                )
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.Transparent)
                        .align(Alignment.CenterVertically)
                ) {
                    Image(
                        imageVector = Icons.Default.MoreVert,
                        contentDescription = null,
                        modifier = Modifier
                            .size(16.dp)
                            .align(Alignment.CenterEnd)
                    )
                }
                Spacer(modifier = Modifier.width(paddingSmall))
            }
            Spacer(modifier = Modifier.height(paddingSmall))
            Text(text = tweet.tweet)
            Spacer(modifier = Modifier.height(paddingLarge))
            tweet.tweetImage?.let {
                Image(
                    painter = painterResource(id = it),
                    contentDescription = null,
                    modifier = Modifier
                        .width(300.dp)
                        .heightIn(max = 300.dp)
                        .clip(RoundedCornerShape(10.dp))
                        .align(Alignment.CenterHorizontally),
                    contentScale = ContentScale.Crop
                )
                Spacer(modifier = Modifier.height(paddingLarge))
            }
            Spacer(modifier = Modifier.height(paddingSmall))
            Row(
                modifier = Modifier
                    .fillMaxWidth(0.90f),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Icon(image = Icons.Outlined.ModeComment, count = tweet.commentCount)
                Icon(image = Icons.Outlined.Repeat, count = tweet.retweetCount)
                Icon(image = Icons.Outlined.FavoriteBorder, count = tweet.likeCount)
                Icon(image = Icons.Outlined.Share)
            }
            Spacer(modifier = Modifier.height(paddingMedium))
        }
    }
    Spacer(
        modifier = Modifier
            .fillMaxWidth()
            .height((0.25).dp)
            .background(LightGray)
    )
}