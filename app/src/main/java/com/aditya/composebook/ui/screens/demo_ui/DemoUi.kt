package com.aditya.composebook.ui.screens.demo_ui

import android.content.Intent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aditya.composebook.twitter.TwitterActivity
import com.aditya.composebook.ui.theme.Padding
import com.aditya.composebook.youtube.YoutubeActivity

@Composable
fun DemoUi() {
    val context = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Text(
            text = "Demo Ui",
            modifier = Modifier
                .padding(Padding.Large.value)
                .align(Alignment.CenterHorizontally),
            fontSize = 40.sp,
            color = MaterialTheme.colors.onBackground,
            fontWeight = FontWeight.Bold
        )
        demoUis.forEach { ui ->
            Button(
                onClick = {
                    when (ui) {
                        "Twitter" -> {
                            context.startActivity(
                                Intent(context, TwitterActivity::class.java)
                            )
                        }
                        "Youtube" -> {
                            context.startActivity(
                                Intent(context, YoutubeActivity::class.java)
                            )
                        }
                    }
                },
                modifier = Modifier
                    .padding(Padding.Medium.value)
                    .fillMaxWidth()
                    .align(Alignment.CenterHorizontally)
            ) {
                Text(
                    text = ui,
                    modifier = Modifier.padding(8.dp)
                )
            }
        }
    }
}