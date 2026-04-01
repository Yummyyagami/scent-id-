package com.scentid.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ProfileScreen() {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        // User Avatar
        Image(painterResource("drawable/user_avatar"), contentDescription = "User Avatar")

        // User Name
        Text(text = "User Name", style = MaterialTheme.typography.h5)

        // Stats
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "Rated: 10")
            }
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "Saved: 5")
            }
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "Reviewed: 8")
            }
        }

        // Ma Garde-Robe Grid
        Text(text = "Ma Garde-Robe", style = MaterialTheme.typography.h6)
        // Here we should have a grid of saved perfumes items

        // Mes Favoris Section
        Text(text = "Mes Favoris", style = MaterialTheme.typography.h6)
        // Here we should have items of favorite perfumes

        Spacer(Modifier.weight(1f))

        // Settings Link
        Button(onClick = { /* Navigate to settings */ }) {
            Text(text = "Settings")
        }
    }
}