package com.example.navigationjetpackcompose.views

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.navigationjetpackcompose.navigation.BottomBarScreen

@Composable
fun BottomBar(navController: NavHostController) {

    val screens = listOf(
        BottomBarScreen.Home,
        BottomBarScreen.Profile,
        BottomBarScreen.Settings
    )

    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    NavigationBar(
    ) {

        screens.forEach { screen ->

            val selected = currentDestination?.hierarchy?.any { it.route == screen.route } == true

            AddItem(
                screen = screen,
                navController = navController,
                selected = selected
            )

        }
    }

}

@Composable
fun RowScope.AddItem(
    screen: BottomBarScreen,
    navController: NavHostController,
    selected: Boolean
) {

    NavigationBarItem(
        label = {
            Text(text = screen.title)
        },
        icon = {
            Icon(
                imageVector = screen.icon,
                contentDescription = "Navigation Icon",
                tint = if (selected) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.onSurface.copy(alpha = 0.6f)
            )
        },
        selected = selected,
        onClick = {
            navController.navigate(screen.route)
        }
    )

}