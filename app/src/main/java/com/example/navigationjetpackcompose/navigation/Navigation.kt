package com.example.navigationjetpackcompose.navigation

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.navigationjetpackcompose.views.Detail
import com.example.navigationjetpackcompose.views.Home

@Composable
fun Navigation() {

    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.HomeScreen.route) {
        composable(Screen.HomeScreen.route) {
            Home(navController = navController)
        }
        composable(
            Screen.DetailScreen.route,
            arguments = listOf(
                navArgument(DETAIL_ARGUMENT_KEY) {
                    type = NavType.IntType

                    //Optional Args:
                    /*defaultValue = 0
                    nullable = true*/
                },
                navArgument(DETAIL_ARGUMENT_KEY2) {
                    type = NavType.StringType
                }
            )
        ) {
            Log.d("Args", it.arguments?.getInt(DETAIL_ARGUMENT_KEY).toString())
            Log.d("Args", it.arguments?.getString(DETAIL_ARGUMENT_KEY2).toString())
            Detail(navController = navController)
        }

        /*
        composable(Screen.ThirdScreen.route) {
            //DefaultTest3(navController = navController)
        }
        */

    }

}