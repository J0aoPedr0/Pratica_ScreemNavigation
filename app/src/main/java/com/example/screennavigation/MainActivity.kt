package com.example.screennavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.screennavigation.ui.theme.Constants
import com.example.screennavigation.userinterface.ScreenB
import com.example.screennavigation.userinterface.ScreenA

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           screemNavigation()
        }
    }
}