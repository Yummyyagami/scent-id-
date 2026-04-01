package com.scentid.ui.components

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun RegistrationNudgeModal() {
    // Background with blur effect
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black.copy(alpha = 0.5f))
            .blur(16.dp)
    ) {
        // Modal content
        Card(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
                .wrapContentHeight(),
            elevation = 4.dp
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                // Title and badge
                Text(text = "Inscription", fontSize = 24.sp, color = Color.Black)
                Spacer(modifier = Modifier.height(8.dp))
                Text(text = "100% Gratuit - Toujours", color = Color.Green)

                // Benefits List
                Column(modifier = Modifier.padding(vertical = 16.dp)) {
                    val benefits = listOf(
                        "Accès illimité aux fonctionnalités",
                        "Pas de frais cachés",
                        "Support client 24/7"
                    )
                    benefits.forEach { benefit ->
                        Row(modifier = Modifier.padding(vertical = 4.dp)) {
                            Checkbox(checked = true, onCheckedChange = null)
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(text = benefit, fontSize = 16.sp)
                        }
                    }
                }

                // Call to action buttons
                Button(onClick = { /* TODO: Handle account creation */ }, colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF00796B))) {
                    Text(text = "Créer un compte gratuit", color = Color.White)
                }
                Spacer(modifier = Modifier.height(8.dp))
                TextButton(onClick = { /* TODO: Handle login */ }) {
                    Text(text = "Se connecter")
                }
                Spacer(modifier = Modifier.height(8.dp))
                TextButton(onClick = { /* TODO: Dismiss modal */ }) {
                    Text(text = "Continuer la navigation")
                }
            }
        }
    }
}