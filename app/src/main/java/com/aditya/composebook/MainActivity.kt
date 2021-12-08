package com.aditya.composebook

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import com.aditya.composebook.twitter.TwitterActivity
import com.aditya.composebook.ui.theme.ComposeBookTheme
import com.aditya.composebook.youtube.YoutubeActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeBookTheme {
                Column(
                    modifier = Modifier.fillMaxSize()
                ) {
                    val context = LocalContext.current
                    Button(
                        onClick = {
                            context.startActivity(
                                Intent(context, YoutubeActivity::class.java)
                            )
                        }
                    ) {
                        Text(text = "Navigate to Youtube")
                    }
                    Button(
                        onClick = {
                            context.startActivity(
                                Intent(context,TwitterActivity::class.java)
                            )
                        }
                    ) {
                        Text(text = "Navigate to twitter")
                    }
                }
            }
        }
    }
}
