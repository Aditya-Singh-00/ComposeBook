package com.aditya.composebook.twitter.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import com.google.accompanist.systemuicontroller.rememberSystemUiController

private val DarkColorPalette = darkColors(
    primary = Blue,
    primaryVariant = Blue,
    secondary = Blue,
    secondaryVariant = Blue,
    background = DimBlue,
    onBackground = White
)

private val LightColorPalette = lightColors(
    primary = Blue,
    primaryVariant = Blue,
    secondary = Blue,
    secondaryVariant = Blue,
    background = White,
    onBackground = Black
)

@Composable
fun TwitterTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {

    val systemUiController = rememberSystemUiController()
    systemUiController.setStatusBarColor(
        color = if (darkTheme) DimBlue else White
    )

    val colors = if (darkTheme) { DarkColorPalette } else { LightColorPalette }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}