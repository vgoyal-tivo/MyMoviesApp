package com.example.mymovieapp

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.cachedIn
import com.example.mymovieapp.RetrofitHelper.moviesApi

const val apiKey = "dabfc8b3d1b6c6f94ca221d20777e30f"
private val pagingConfig = PagingConfig(
    pageSize = 20,
    enablePlaceholders = false
)

class MovieViewModel : ViewModel() {
    val movieFlow = Pager(pagingConfig) {
        MoviePagingSource(moviesApi, apiKey)
    }.flow.cachedIn(viewModelScope)
}

//    suspend fun fetchPopularMovies(apiKey: String, page: Int): List<Movie> {
//        val response = moviesApi.getMovies(apiKey, page)
//        if (response.isSuccessful) {
//            return response.body()?.results ?: emptyList()
//        } else {
//            throw Exception("Failed to fetch data")
//        }
//    }
//}

