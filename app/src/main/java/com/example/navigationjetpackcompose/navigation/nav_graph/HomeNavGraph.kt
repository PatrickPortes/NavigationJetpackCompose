package com.example.navigationjetpackcompose.navigation.nav_graph

import androidx.navigation.*
import androidx.navigation.compose.composable
import com.example.navigationjetpackcompose.navigation.DETAIL_ARGUMENT_KEY
import com.example.navigationjetpackcompose.navigation.DETAIL_ARGUMENT_KEY2
import com.example.navigationjetpackcompose.navigation.HOME_ROUTE
import com.example.navigationjetpackcompose.navigation.Screen
import com.example.navigationjetpackcompose.views.DetailScreen
import com.example.navigationjetpackcompose.views.HomeScreen

fun NavGraphBuilder.homeNavGraph(
    navController: NavHostController
) {
    navigation(
        startDestination = Screen.HomeScreen.route,
        route = HOME_ROUTE
    ) {
        composable(
            route = Screen.HomeScreen.route
        ) {
            HomeScreen(navController = navController)
        }
        composable(
            route = Screen.DetailScreen.route,
            arguments = listOf(
                navArgument(DETAIL_ARGUMENT_KEY) {
                    type = NavType.IntType
                    defaultValue = 0
                },
                navArgument(DETAIL_ARGUMENT_KEY2) {
                    type = NavType.StringType
                    defaultValue = "Patrick"
                }
            )
        ) {
            DetailScreen(navController = navController)
        }
    }
}