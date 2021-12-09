package com.aditya.composebook.youtube.ui.screen.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.BottomAppBar
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aditya.composebook.youtube.ui.screen.util.NavItem
import com.aditya.composebook.youtube.ui.theme.paddingMedium

@Composable
fun BottomBar(
    items: List<NavItem> = emptyList()
) {
    BottomAppBar(
        modifier = Modifier.fillMaxWidth(),
        contentColor = MaterialTheme.colors.onBackground,
        backgroundColor = MaterialTheme.colors.background
    ) {
        LazyRow(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            contentPadding = PaddingValues(horizontal = paddingMedium)
        ) {
            items(items) { item ->
                Box(
                    modifier = Modifier.width(65.dp),
                    contentAlignment = Alignment.Center
                ) {
                    BottomBarIcon(item)
                }
            }
        }
    }
}

@Composable
private fun BottomBarIcon(
    item: NavItem
) {
    val size = if (item.label == null) 40.dp else 25.dp
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            imageVector = item.icon,
            contentDescription = null,
            modifier = Modifier.size(size)
        )
        item.label?.let {
            Text(
                text = it,
                fontSize = 10.sp,
                fontWeight = FontWeight.Light
            )
        }
    }
}