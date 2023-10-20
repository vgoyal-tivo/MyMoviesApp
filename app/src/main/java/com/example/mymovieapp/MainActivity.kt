package com.example.mymovieapp

import android.os.Bundle

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.paging.LoadState
import androidx.paging.compose.collectAsLazyPagingItems
import androidx.paging.compose.items
import coil.compose.rememberAsyncImagePainter
import com.example.mymovieapp.ui.theme.MyMovieAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            MyMovieAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                   // MovieListScreen()
                    SetNavigationView()
                }
            }

        }
    }
}


@Composable
fun MovieListScreen() {
    val viewModel = MovieViewModel()
    val movies = viewModel.movieFlow.collectAsLazyPagingItems()
    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        items(movies) {
            // Display your movie data here
            if (it != null) {
                Row {
                    Image(
                        modifier = Modifier.height(100.dp).width(100.dp),
                        painter = rememberAsyncImagePainter("https://image.tmdb.org/t/p/w500${it.poster_path}"),
                        contentDescription = it.title
                    )
                    Column {
                        Text(text = it.title)
                        Text(text = it.adult.toString())
                    }
                }
            }
        }

        movies.apply {
            when {
                loadState.refresh is LoadState.Loading -> {
                    // loading indicator
                }

                loadState.append is LoadState.Loading -> {
                    // Display loading at the end of the list
                }

                loadState.refresh is LoadState.Error -> {
                    // error message
                }

                loadState.append is LoadState.Error -> {
                    // Display error at the end of the list
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyMovieAppTheme {
        MovieListScreen()
    }
}