package com.villain.mynavigation.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth

import androidx.compose.material.Button

import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*

import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

import androidx.navigation.NavHostController
import com.villain.mynavigation.navigation.Screen

@Composable
fun Home(navController: NavHostController) {

    var text by remember { mutableStateOf("") }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth()
    ) {
        TextField(
            value = text, onValueChange = { text = it })


        Button(onClick = {
            if(text!="") {
            navController.navigate("sub_screen/$text")
        }
        }) {
            Text("Boop")
        }
    }


}