package com.scentid.ui.components

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import kotlin.random.Random

@Composable
fun PerfumeCard(perfumeName: String, brand: String, rating: Float, voteCount: Int, imageUrl: String) {
    var isSaved by remember { mutableStateOf(false) }

    Box(modifier = Modifier
        .padding(16.dp)
        .clickable(onLongClick = {
            isSaved = true
            // Trigger save animation logic here
        })
        .shadow(10.dp)
        .background(Color(0x4CFFFFFF)) // RGBA(255, 255, 255, 0.04)
        .fillMaxWidth()) {

        Image(
            painter = rememberImagePainter(imageUrl),
            contentDescription = null,
            modifier = Modifier.fillMaxSize()
        )

        // Glassmorphism effect
        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
                .padding(8.dp)
                .background(Color(0x99FFFFFF), MaterialTheme.shapes.medium), // Adjust alpha for glass effect
            elevation = 0.dp
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text(text = perfumeName, style = MaterialTheme.typography.h6, color = Color.White)
                Text(text = brand, style = MaterialTheme.typography.body2, color = Color.White)
                Spacer(modifier = Modifier.height(8.dp))
                RatingRow(rating, voteCount)
            }
        }
    }
}

@Composable
fun RatingRow(rating: Float, voteCount: Int) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        repeat(5) { index ->
            Icon(
                imageVector = if (index < rating.toInt()) Icons.Default.Star else Icons.Default.StarBorder,
                contentDescription = "Rating Star",
                tint = Color.Yellow
            )
        }
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = "($voteCount votes)", color = Color.White)
    }
}
