package com.aditya.composebook.model

data class YoutubeVideo(
    val preview: Int,
    val channelProfile: Int,
    val channelName: String,
    val title: String,
    val views: String,
    val timesAgo: String,
    val duration: String
)
