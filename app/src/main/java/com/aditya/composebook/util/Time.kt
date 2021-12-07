package com.aditya.composebook.util

class Time {
    companion object {
        private const val SECOND_MILLIS = 1000
        private const val MINUTE_MILLIS = SECOND_MILLIS * 60
        private const val HOUR_MILLIS = MINUTE_MILLIS * 60
        private const val DAYS_MILLIS = HOUR_MILLIS * 24
    }

    fun getRelativeTime(timeStamp: Long): String {
        val diff = System.currentTimeMillis() - timeStamp
        return when {
            diff < MINUTE_MILLIS -> { "$diff s" }
            diff < HOUR_MILLIS -> { "$diff / $MINUTE_MILLIS m" }
            diff < DAYS_MILLIS -> { "$diff / $HOUR_MILLIS h" }
            else -> { "$diff / $DAYS_MILLIS d" }
        }
    }
}