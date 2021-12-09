package com.aditya.composebook

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.aditya.composebook.ui.theme.ComposeBookTheme
import com.aditya.composebook.util.Navigation

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeBookTheme {
                val navController = rememberNavController()
                Navigation(navController)
            }
        }
    }
}
