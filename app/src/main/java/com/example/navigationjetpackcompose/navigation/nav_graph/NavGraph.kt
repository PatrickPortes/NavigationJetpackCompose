package com.example.navigationjetpackcompose.navigation.nav_graph

import android.annotation.SuppressLint
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.example.navigationjetpackcompose.views.BottomBar

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NavGraph(
) {
    val navController = rememberNavController()

    Scaffold(
        bottomBar = { BottomBar(navController = navController) }
    ) {
        BottomNavGraph(navController)
    }

//    NavHost(
//        navController = navController,
//        startDestination = HOME_ROUTE,
//        route = ROOT_ROUTE
//    ) {
//        homeNavGraph(navController = navController)
//        authNavGraph(navController = navController)
//    }
}