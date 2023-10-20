package com.example.mymovieapp

data class Movie(
    val id: Int,
    val title: String,
    val adult: Boolean,
    val poster_path: String,
    val popularity: String,
    val vote_count: String,
    val overview: String
)

