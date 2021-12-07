package com.aditya.composebook.model

data class Tweet(
    val userName: String,
    val userId: String,
    val userProfile: Int = 0,
    val tweet: String,
    val tweetImage: Int? = null,
    val commentCount: Int,
    val retweetCount: Int,
    val likeCount: Int,
    val tweetTime: String
)
