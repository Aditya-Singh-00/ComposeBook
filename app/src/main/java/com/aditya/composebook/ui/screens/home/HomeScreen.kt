package com.aditya.composebook.ui.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Switch
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.aditya.composebook.ui.theme.White
import com.aditya.composebook.util.Screen
import com.aditya.composebook.R
import com.aditya.composebook.ui.theme.ComposeBookThemeSettings
import com.aditya.composebook.ui.theme.Padding

@Composable
fun HomeScreen(
    navController: NavController
) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Text(
            text = stringResource(id = R.string.app_name),
            modifier = Modifier
                .padding(Padding.Large.value)
                .align(Alignment.CenterHorizontally),
            fontSize = 40.sp,
            color = MaterialTheme.colors.onBackground,
            fontWeight = FontWeight.Bold
        )
//            Switch(
//                checked = ComposeBookThemeSettings.isDarkThemeEnabled,
//                onCheckedChange = { ComposeBookThemeSettings.isDarkThemeEnabled = it },
//                modifier = Modifier
//                    .padding(Padding.Large.value)
//                    .align(Alignment.CenterVertically)
//                    .size(40.dp)
//            )

        Box(
            modifier = Modifier
                .padding(Padding.Large.value)
                .fillMaxWidth()
                .height(100.dp)
                .background(MaterialTheme.colors.primary)
                .clickable {
                    navController.navigate(Screen.DemoUi.route)
                }
        ) {
            Text(
                text = "Demo UIs",
                fontSize = 25.sp,
                color = White,
                modifier = Modifier.align(Alignment.Center)
            )
        }
    }
}