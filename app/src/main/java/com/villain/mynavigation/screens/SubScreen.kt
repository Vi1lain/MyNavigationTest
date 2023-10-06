package com.villain.mynavigation.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.navigation.NavHostController
import com.villain.mynavigation.navigation.Screen

@Composable
fun SubScreen(text:String,
              navController: NavHostController) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = text)


        Button(onClick = {
            navController.popBackStack("home_screen",inclusive = false)
        }) {

        }
    }
}