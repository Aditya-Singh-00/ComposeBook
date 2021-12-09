package com.aditya.composebook.youtube.ui.screen.util

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector

data class NavItem(
    val icon: ImageVector,
    val label: String? = null
)

val items = listOf(
    NavItem(
        icon = Icons.Default.Home,
        label = "Home"
    ),
    NavItem(
        icon = Icons.Default.Whatshot,
        label = "Shorts"
    ),
    NavItem(
        icon = Icons.Default.AddCircleOutline
    ),
    NavItem(
        icon = Icons.Default.Subscriptions,
        label = "Subscriptions"
    ),
    NavItem(
        icon = Icons.Default.VideoLibrary,
        label = "Library"
    )
)
