package com.example.composemoneymanager.views

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import com.example.composemoneymanager.R
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composemoneymanager.ui.theme.primaryColor
import com.example.composemoneymanager.ui.theme.seconderyColor

@Composable
fun HomePage() {
    val brush = Brush.horizontalGradient(listOf(primaryColor, seconderyColor))
    Box(modifier = Modifier) {
        Canvas(
            modifier = Modifier
                .size(230.dp)
                .align(Alignment.TopEnd)
                .padding(start = 70.dp, end = 30.dp),

            onDraw = {
                drawCircle(brush)
            }
        )

        Text(
            text = "Manage",
            style = MaterialTheme.typography.h1.copy(fontSize = 75.sp),
            modifier = Modifier.padding(start = 40.dp, top = 70.dp)
        )
        Text(
            text = "Money",
            style = MaterialTheme.typography.h1.copy(fontSize = 75.sp),
            modifier = Modifier.padding(start = 60.dp, top = 150.dp)
        )
        Text(
            text = "in House",
            style = MaterialTheme.typography.h1.copy(fontSize = 75.sp),
            modifier = Modifier.padding(start = 40.dp, top = 230.dp)
        )
        Image(
            painter = painterResource(R.drawable.image),
            contentDescription = "",
            modifier = Modifier
                .requiredSize(600.dp, 700.dp)
                .padding(start = 30.dp, top = 300.dp),
        )

        Card(
            modifier = Modifier
                .padding(start = 20.dp, bottom = 20.dp)
                .height(50.dp)
                .width(50.dp)
                .align(Alignment.BottomStart),
            backgroundColor = Color.Black,
            shape = RoundedCornerShape(50)
        )
        {
            Image(
                painter = painterResource(R.drawable.share),
                modifier = Modifier
                    .requiredSize(20.dp, 20.dp),
                contentDescription = "",
                colorFilter = ColorFilter.tint(color = Color.White)
            )
        }
    }
}