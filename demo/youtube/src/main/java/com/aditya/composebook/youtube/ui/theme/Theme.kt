package com.aditya.composebook.youtube.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
    primary = Red,
    background = Gray,
    onBackground = White
)

private val LightColorPalette = lightColors(
    primary = Red,
    background = White,
    onBackground = Gray
)

@Composable
fun YoutubeTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) { DarkColorPalette } else { LightColorPalette }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}