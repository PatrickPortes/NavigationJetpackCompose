package com.example.navigationjetpackcompose.views

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.navigationjetpackcompose.navigation.Screen
import com.example.navigationjetpackcompose.ui.theme.NavigationJetpackComposeTheme

@Composable
fun HomeScreen(navController: NavController) {
    NavigationJetpackComposeTheme {

        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Text(
                modifier = Modifier.clickable {
                    navController.navigate(route = Screen.DetailScreen.passNameAndId(
                        id = 1,
                        name = "Patrick"
                    ))
                },

                text = "Home Screen",
                fontSize = MaterialTheme.typography.displayLarge.fontSize,
                color = MaterialTheme.colorScheme.primary,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                lineHeight = MaterialTheme.typography.displayLarge.lineHeight
            )
            Text(
                modifier = Modifier
                    .padding(top = 150.dp)
                    .clickable {

                        navController.navigate(route = Screen.LoginScreen.route)

                    },
                text = "Login / Sign Up",
                fontSize = MaterialTheme.typography.titleLarge.fontSize,
                fontWeight = FontWeight.Medium,
                textAlign = TextAlign.Center
            )

        }

    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen(rememberNavController())
}