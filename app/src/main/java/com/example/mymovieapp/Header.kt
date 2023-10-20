package com.example.mymovieapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Header() {
    Box(modifier = Modifier
        .height(50.dp)
        .fillMaxWidth()) {
        Row(modifier = Modifier.align(Alignment.CenterStart)) {
            Image(
                painter = painterResource(id = R.drawable.play),
                contentDescription = "",
                modifier = Modifier
                    .padding(start = 20.dp)
                    .height(40.dp)
                    .width(40.dp)
                    .align(Alignment.CenterVertically)

            )
            Spacer(modifier = Modifier.width(10.dp))
            Text(
                text = "Let's Watch",
                color = Color.White,
                fontSize = 25.sp,
                modifier = Modifier.align(Alignment.CenterVertically)
            )
        }
        Row(modifier = Modifier.align(Alignment.CenterEnd)) {
            Image(
                painter = painterResource(id = R.drawable.search),
                contentDescription = "",
                modifier = Modifier
                    .height(25.dp)
                    .width(25.dp)
            )
            Spacer(modifier = Modifier.width(10.dp))
            Image(
                painter = painterResource(id = R.drawable.profile),
                contentDescription = "",
                modifier = Modifier
                    .padding(end = 20.dp)
                    .height(25.dp)
                    .width(25.dp)
            )
        }
    }
}

@Preview
@Composable
fun HeaderPreview() {
    Header()
}