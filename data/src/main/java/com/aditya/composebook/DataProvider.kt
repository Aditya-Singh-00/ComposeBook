package com.aditya.composebook

import com.aditya.composebook.data.tweets
import com.aditya.composebook.data.youtubeVideos

class DataProvider {
    fun getTweets() = tweets
    fun getYoutubeVideos() = youtubeVideos
}