package com.example.navigationjetpackcompose.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.example.navigationjetpackcompose.ui.theme.NavigationJetpackComposeTheme

@Composable
fun SettingsScreen(){
    NavigationJetpackComposeTheme {

        Column (
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Text(
                text = "Settings Screen",
                fontSize = MaterialTheme.typography.displayLarge.fontSize,
                color = MaterialTheme.colorScheme.tertiary,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                lineHeight = MaterialTheme.typography.displayLarge.lineHeight
            )

        }

    }
}


@Preview(showBackground = true)
@Composable
fun SettingsScreenPreview(){
    SettingsScreen()
}