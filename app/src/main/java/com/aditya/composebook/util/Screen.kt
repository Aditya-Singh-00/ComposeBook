package com.aditya.composebook.util

sealed class Screen(val route: String) {
    object Home: Screen("home")
    object DemoUi: Screen("demo_ui")
}