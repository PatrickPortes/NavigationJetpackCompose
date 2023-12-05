package com.example.navigationjetpackcompose.navigation.nav_graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.example.navigationjetpackcompose.navigation.AUTH_ROUTE
import com.example.navigationjetpackcompose.navigation.Screen
import com.example.navigationjetpackcompose.views.LoginScreen
import com.example.navigationjetpackcompose.views.SignUpScreen

fun NavGraphBuilder.authNavGraph(
    navController: NavHostController
){
    navigation(
        startDestination = Screen.LoginScreen.route,
        route = AUTH_ROUTE
    ){
        composable(
            route = Screen.LoginScreen.route
        ) {
            LoginScreen(navController = navController)
        }
        composable(
            route = Screen.SignUpScreen.route
        ) {
            SignUpScreen(navController = navController)
        }
    }
}