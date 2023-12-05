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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Popup
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.navigationjetpackcompose.navigation.HOME_ROUTE
import com.example.navigationjetpackcompose.navigation.Screen
import com.example.navigationjetpackcompose.ui.theme.NavigationJetpackComposeTheme

@Composable
fun LoginScreen(navController: NavController) {
    NavigationJetpackComposeTheme {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Text(
                modifier = Modifier
                    .clickable {

                        navController.navigate(route = Screen.SignUpScreen.route)

                    },
                text = "Login Screen",
                fontSize = MaterialTheme.typography.displayLarge.fontSize,
                color = Color.Cyan,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )
            Text(
                modifier = Modifier
                    .padding(top = 150.dp)
                    .clickable {

                        navController.navigate(route = Screen.HomeScreen.route) {
                            popUpTo(HOME_ROUTE)
                        }

                    },
                text = "Go Back",
                fontSize = MaterialTheme.typography.titleLarge.fontSize,
                fontWeight = FontWeight.Medium,
                textAlign = TextAlign.Center
            )

        }
    }
}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    NavigationJetpackComposeTheme {
        LoginScreen(rememberNavController())
    }
}