package com.scentid.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.material.Button
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Camera
import androidx.compose.ui.res.stringResource

@Composable
fun HomeScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("ScentID") }
            )
        },
        floatingActionButton = {
            FloatingActionButton(onClick = { /* TODO: Handle scan action */ }) {
                Icon(Icons.Filled.Camera, contentDescription = "Scan")
            }
        },
        content = { padding ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(padding)
                    .verticalScroll(rememberScrollState())
            ) {
                // Horizontal Scroll Carousel for "Trending This Week"
                Text("Trending This Week", style = MaterialTheme.typography.h6)
                // TODO: Add your carousel implementation here

                Spacer(modifier = Modifier.height(16.dp))

                // Horizontal Scroll Carousel for "Based on Your Wardrobe"
                Text("Based on Your Wardrobe", style = MaterialTheme.typography.h6)
                // TODO: Add your AI recommendations implementation here
            }
        }
    )
}