package com.example.screennavigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.screennavigation.ui.theme.Constants
import com.example.screennavigation.userinterface.ScreenA
import com.example.screennavigation.userinterface.ScreenB

@Composable
fun screemNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Constants.ScreenA, builder = {
        composable(Constants.ScreenA){
            ScreenA(navController)
        }
        composable(Constants.ScreenB + "/{name}",){
            val name = it.arguments?.getString("name")
            ScreenB(name ?: "No name")
        }
    })
}