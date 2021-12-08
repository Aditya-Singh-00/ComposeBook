package com.aditya.composebook.data

import com.aditya.composebook.model.YoutubeVideo
import com.aditya.data.R

val youtubeVideo = YoutubeVideo(
    preview = R.drawable.image_1,
    channelProfile = R.drawable.ic_google,
    channelName = "Google",
    title = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
    views = "47K views",
    timesAgo = "1 day ago",
    duration = "9:55"
)

val youtubeVideos = listOf(
    youtubeVideo,
    youtubeVideo.copy(
        preview = R.drawable.image_2,
        channelProfile = R.drawable.ic_amazon,
        channelName = "Amazon"
    ),
    youtubeVideo.copy(
        preview = R.drawable.image_2,
        channelProfile = R.drawable.ic_apple,
        channelName = "Apple"
    ),
    youtubeVideo.copy(
        preview = R.drawable.image_2,
        channelProfile = R.drawable.kotlin,
        channelName = "Kotlin"
    ),
    youtubeVideo.copy(
        preview = R.drawable.image_2,
        channelProfile = R.drawable.facebook,
        channelName = "Facebook"
    ),
    youtubeVideo.copy(
        preview = R.drawable.image_2,
        channelProfile = R.drawable.jetbrains,
        channelName = "Jetbrains"
    ),
    youtubeVideo.copy(
        preview = R.drawable.image_2,
        channelProfile = R.drawable.youtube,
        channelName = "YouTube"
    ),
    youtubeVideo.copy(
        preview = R.drawable.image_2,
        channelProfile = R.drawable.gmail,
        channelName = "Gmail"
    ),
    youtubeVideo.copy(
        preview = R.drawable.image_2,
        channelProfile = R.drawable.netflix,
        channelName = "Netflix"
    ),
    youtubeVideo.copy(
        preview = R.drawable.image_2,
        channelProfile = R.drawable.twitter,
        channelName = "Twitter"
    )
)