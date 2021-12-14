package com.aditya.composebook.animation.ui

import androidx.compose.foundation.Canvas
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PointMode
import androidx.compose.ui.graphics.StrokeCap
import com.aditya.composebook.animation.core.Coordinate
import com.aditya.composebook.animation.core.scale
import com.aditya.composebook.animation.core.translate

@Composable
fun CustomBox() {

    var coordinates = remember { listOf(
        Coordinate(-1.0, -1.0, -1.0, 1.0),
        Coordinate(-1.0, -1.0, 1.0, 1.0),
        Coordinate(-1.0, 1.0, -1.0, 1.0),
        Coordinate(-1.0, 1.0, 1.0, 1.0),
        Coordinate(1.0, -1.0, -1.0, 1.0),
        Coordinate(1.0, -1.0, 1.0, 1.0),
        Coordinate(1.0, 1.0, -1.0, 1.0),
        Coordinate(1.0, 1.0, 1.0, 1.0)
    )}

    LaunchedEffect(true) {
        coordinates = translate(coordinates.toTypedArray(),2.0,2.0,2.0).toList()
        coordinates = scale(coordinates.toTypedArray(),40.0,40.0,40.0).toList()
    }

    Canvas(modifier = Modifier) {
        drawPoints(
            points = listOf(
                Offset(coordinates[0].x.toFloat(),coordinates[1].y.toFloat()),
                Offset(coordinates[1].x.toFloat(),coordinates[3].y.toFloat()),
                Offset(coordinates[3].x.toFloat(),coordinates[2].y.toFloat()),
                Offset(coordinates[2].x.toFloat(),coordinates[0].y.toFloat()),
                Offset(coordinates[4].x.toFloat(),coordinates[5].y.toFloat()),
                Offset(coordinates[5].x.toFloat(),coordinates[7].y.toFloat()),
                Offset(coordinates[7].x.toFloat(),coordinates[6].y.toFloat()),
                Offset(coordinates[6].x.toFloat(),coordinates[4].y.toFloat()),
                Offset(coordinates[0].x.toFloat(),coordinates[4].y.toFloat()),
                Offset(coordinates[1].x.toFloat(),coordinates[5].y.toFloat()),
                Offset(coordinates[2].x.toFloat(),coordinates[6].y.toFloat()),
                Offset(coordinates[3].x.toFloat(),coordinates[7].y.toFloat()),
            ),
            pointMode = PointMode.Lines,
            color = Color.Red,
            cap = StrokeCap.Round
        )
    }

}