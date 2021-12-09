package com.aditya.composebook.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

private val DarkColorPalette = darkColors(
    primary = Blue,
    primaryVariant = Blue,
    background = Gray,
    onBackground = White
)

private val LightColorPalette = lightColors(
    primary = Blue,
    primaryVariant = Blue,
    background = White,
    onBackground = Gray
)

@Composable
fun ComposeBookTheme(
    darkTheme: Boolean = false,
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

object ComposeBookThemeSettings {
    var isDarkThemeEnabled by mutableStateOf(false)
}