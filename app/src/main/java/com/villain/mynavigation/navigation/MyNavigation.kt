package com.villain.mynavigation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

import com.villain.mynavigation.screens.Home
import com.villain.mynavigation.screens.SubScreen

sealed class Screen(val route: String) {
    object HomeScreen : Screen("home_screen")
    object SubScreen : Screen("sub_screen")
}

@Composable
fun MyNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "home_screen") {

        composable("home_screen") { Home(navController = navController) }
        composable(
            "sub_screen/{text}",
        arguments = listOf(navArgument( "text"){
            type = NavType.StringType
           // defaultValue = "user1234"
        })
            ) {backStackEntry ->
            SubScreen(backStackEntry .arguments?.getString("text")?:"",
                 navController) }

    }
}