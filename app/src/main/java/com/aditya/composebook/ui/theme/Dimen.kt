package com.aditya.composebook.ui.theme

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

sealed class Padding(val value: Dp) {
    object Small: Padding(4.dp)
    object Medium: Padding(8.dp)
    object Large: Padding(12.dp)
}
