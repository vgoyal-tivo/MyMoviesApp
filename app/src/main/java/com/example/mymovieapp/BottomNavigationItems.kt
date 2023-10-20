package com.example.mymovieapp

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Star
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavigationItems(val title: String, val route: String, val icon: ImageVector) {
    object Home : BottomNavigationItems("Home","home", Icons.Default.Home)
    object New : BottomNavigationItems("New", "new", Icons.Default.PlayArrow)
    object Popular : BottomNavigationItems("Popular", "popular", Icons.Default.Star)
    object Watchlist : BottomNavigationItems("Watchlist", "watchlist",Icons.Default.AccountBox)
    object Sports : BottomNavigationItems("Sports", "sports", Icons.Default.Face)
}