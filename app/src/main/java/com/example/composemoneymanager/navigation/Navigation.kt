package com.example.composemoneymanager.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.composemoneymanager.views.home_page.HomePage
import com.example.composemoneymanager.views.splash.SplashScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "splash_screen"
    ) {
        composable("splash_screen") {
            // Splash
            SplashScreen(navController = navController)
        }
        // Main Screen
        composable("main_screen") {
            HomePage()
        }
    }
}
