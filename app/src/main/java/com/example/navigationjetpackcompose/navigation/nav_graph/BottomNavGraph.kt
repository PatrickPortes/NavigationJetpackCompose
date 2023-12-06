package com.example.navigationjetpackcompose.navigation.nav_graph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.navigationjetpackcompose.navigation.BottomBarScreen
import com.example.navigationjetpackcompose.views.HomeScreen
import com.example.navigationjetpackcompose.views.ProfileScreen
import com.example.navigationjetpackcompose.views.SettingsScreen

@Composable
fun BottomNavGraph(navController: NavHostController) {

    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Home.route,
    ) {
        composable(BottomBarScreen.Home.route) {
            //HOME_ROUTE
            HomeScreen(navController = navController)
        }
        composable(BottomBarScreen.Profile.route) {
            ProfileScreen()
        }
        composable(BottomBarScreen.Settings.route) {
            SettingsScreen()
        }
    }

}