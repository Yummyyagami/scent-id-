package com.scentid.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun SeasonBadge(season: String, isActive: Boolean, votes: Int) {
    val backgroundColor = if (isActive) Color(0xFFBB86FC) else Color(0xFFEEEEEE)

    Column(
        modifier = Modifier
            .padding(8.dp)
            .background(backgroundColor)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            painter = painterResource(id = R.drawable.ic_season), // Replace with actual season icon resource
            contentDescription = "$season Icon",
            modifier = Modifier.size(48.dp)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = season, style = MaterialTheme.typography.h6)
        Spacer(modifier = Modifier.height(4.dp))
        VoteBars(votes)
    }
}

@Composable
fun VoteBars(votes: Int) {
    // Example implementation of vote bars
    Row {
        repeat(votes) {
            Box(modifier = Modifier
                .size(24.dp, 8.dp)
                .background(Color.Green))
        }
        // Optionally, handle not voted bars
        val remainingBars = 5 - votes
        repeat(remainingBars) {
            Box(modifier = Modifier
                .size(24.dp, 8.dp)
                .background(Color.Gray))
        }
    }
}