package com.example.navigationjetpackcompose.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.navigationjetpackcompose.navigation.nav_graph.NavGraph
import com.example.navigationjetpackcompose.ui.theme.NavigationJetpackComposeTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavigationJetpackComposeTheme {
                NavGraph()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TestPreview() {
    NavigationJetpackComposeTheme {
        NavGraph()
    }
}