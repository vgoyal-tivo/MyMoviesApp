package com.example.mymovieapp

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable


@Composable
fun NavigationGraph(navController: NavHostController) {
    NavHost(navController, startDestination = BottomNavigationItems.Home.route) {
        composable(BottomNavigationItems.Home.route) {
            HomeScreen()
        }
        composable(BottomNavigationItems.New.route) {
            NewScreen()
        }
        composable(BottomNavigationItems.Popular.route) {
            PopularScreen()
        }
        composable(BottomNavigationItems.Watchlist.route) {
            WatchlistScreen()
        }
        composable(BottomNavigationItems.Sports.route) {
            SportsScreen()
        }
    }
}