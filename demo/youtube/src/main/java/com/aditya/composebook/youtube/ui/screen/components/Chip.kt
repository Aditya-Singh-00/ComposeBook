package com.aditya.composebook.youtube.ui.screen.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.aditya.composebook.youtube.ui.theme.*

@Composable
fun Chip(
    text: String
) {
    Box(
        modifier = Modifier
            .height(40.dp)
            .padding(paddingSmall)
            .clip(RoundedCornerShape(40.dp/3))
            .background(MaterialTheme.colors.surface)
            .border(
                border = BorderStroke(1.dp, GrayBorder),
                shape = RoundedCornerShape(40.dp / 3)
            )
            .padding(horizontal = paddingMedium, vertical = paddingSmall)
    ) {
        Text(
            text = text,
            modifier = Modifier.align(Alignment.Center),
            fontWeight = FontWeight.Light,
            style = MaterialTheme.typography.body1,
            color = MaterialTheme.colors.onSurface
        )
    }
}