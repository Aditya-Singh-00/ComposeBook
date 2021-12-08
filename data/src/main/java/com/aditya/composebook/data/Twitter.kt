package com.aditya.composebook.data

import com.aditya.composebook.model.Tweet
import com.aditya.data.R

val tweet = Tweet(
    userName = "Google",
    userId = "@google",
    userProfile = R.drawable.ic_google,
    tweet = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
            "Duis tempus est quis venenatis euismod.",
    tweetImage = R.drawable.image_1,
    commentCount = 134,
    retweetCount = 27,
    likeCount = 574,
    tweetTime = "37m"
)

val tweets = listOf(
    tweet,
    tweet.copy(
        userName = "Amazon",
        userId = "@amazon",
        userProfile = R.drawable.ic_amazon,
        tweetImage = R.drawable.image_2,
        tweetTime = "2h"
    ),
    tweet.copy(
        userName = "Apple",
        userId = "@apple",
        userProfile = R.drawable.ic_apple,
        tweetImage = R.drawable.image_3,
        tweetTime = "45s"
    ),
    tweet.copy(
        userName = "Facebook",
        userId = "@facebook",
        userProfile = R.drawable.facebook,
        tweetImage = R.drawable.image_4,
        tweetTime = "12m"
    ),
    tweet.copy(
        userName = "Gmail",
        userId = "@gmail",
        userProfile = R.drawable.gmail,
        tweetImage = null,
        tweetTime = "7h"
    ),
    tweet.copy(
        userName = "JetBrains",
        userId = "@jetbrains",
        userProfile = R.drawable.jetbrains,
        tweetImage = null,
        tweetTime = "3m"
    ),
    tweet.copy(
        userName = "Kotlin",
        userId = "@kotlin",
        userProfile = R.drawable.kotlin,
        tweetImage = R.drawable.image_5,
        tweetTime = "5d"
    ),
    tweet.copy(
        userName = "Netflix",
        userId = "@netflix",
        userProfile = R.drawable.netflix,
        tweetImage = R.drawable.image_6,
        tweetTime = "12s"
    ),
    tweet.copy(
        userName = "Twitter",
        userId = "@twitter",
        userProfile = R.drawable.twitter,
        tweetImage = R.drawable.image_7,
        tweetTime = "45m"
    ),
    tweet.copy(
        userName = "YouTube",
        userId = "@youtube",
        userProfile = R.drawable.youtube,
        tweetImage = R.drawable.image_8,
        tweetTime = "2d"
    )
)