package com.scentid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavGraph
import androidx.navigation.compose.*n
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { 
            JetpackComposeApp() 
        }
    }
}

@Composable
fun JetpackComposeApp() {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = { 
            BottomNavigationBar(navController) 
        }
    ) { 
        NavHost(navController, startDestination = "home") { 
            composable("home") { HomeScreen() }
            composable("search") { SearchScreen() }
            composable("scan") { ScanScreen() }
            composable("wardrobe") { WardrobeScreen() }
            composable("profile") { ProfileScreen() }
        }
    }
}

@Composable
fun BottomNavigationBar(navController: NavController) {
    BottomNavigation() {
        val navItems = listOf("home", "search", "scan", "wardrobe", "profile")
        navItems.forEach { item -> 
            BottomNavigationItem(
                icon = { /* Icon */ },
                label = { Text(item.capitalize()) }, 
                selected = false, // You should implement the logic to set selected state
                onClick = { navController.navigate(item) }
            )
        }
    }
}

@Composable
fun HomeScreen() { /* Home screen content */ }
@Composable
fun SearchScreen() { /* Search screen content */ }
@Composable
fun ScanScreen() { /* Scan screen content */ }
@Composable
fun WardrobeScreen() { /* Wardrobe screen content */ }
@Composable
fun ProfileScreen() { /* Profile screen content */ }
