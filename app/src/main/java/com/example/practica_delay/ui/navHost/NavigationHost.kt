package com.example.practica_delay.ui.navHost

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.practica_delay.ui.screen.HomeScreen
import com.example.practica_delay.ui.screen.ProfileScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "home"
    ) {
        composable("home") {
            HomeScreen(navController)
        }
        composable("profile/{id}") { backstack ->
            val id = backstack.arguments?.getString("id")
            ProfileScreen(navController, id)
        }
    }
}
