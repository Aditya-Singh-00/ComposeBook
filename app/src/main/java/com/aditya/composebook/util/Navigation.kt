package com.aditya.composebook.util

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.aditya.composebook.ui.screens.demo_ui.DemoUi
import com.aditya.composebook.ui.screens.home.HomeScreen

@Composable
fun Navigation(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {
        composable(Screen.Home.route) {
            HomeScreen(navController)
        }
        composable(Screen.DemoUi.route) {
            DemoUi()
        }
    }
}
