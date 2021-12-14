package com.aditya.composebook.gmail.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
    primary = Blue,
    secondary = Blue,
    background = LightBlue,
    onBackground = Black,
    surface = White,
    onSurface = Black
)

private val LightColorPalette = lightColors(
    primary = Blue,
    secondary = Blue,
    background = LightBlue,
    onBackground = Black,
    surface = White,
    onSurface = Black
)

@Composable
fun GmailTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}