package com.example.navigationjetpackcompose.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navigationjetpackcompose.views.Detail
import com.example.navigationjetpackcompose.views.Home

@Composable
fun Navigation() {

    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.HomeScreen.route) {
        composable(Screen.HomeScreen.route) {
            Home(navController = navController)
        }
        composable(Screen.DetailScreen.route) {
            Detail(navController = navController)
        }

        /*
        composable(Screen.ThirdScreen.route) {
            //DefaultTest3(navController = navController)
        }
        */

    }

}