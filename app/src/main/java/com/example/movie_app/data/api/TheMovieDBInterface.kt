package com.example.movie_app.data.api
import com.example.movie_app.data.vo.MovieDetails
import com.example.movie_app.data.vo.MovieResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface TheMovieDBInterface {

    // popular movies : https://api.themoviedb.org/3/movie/popular?api_key=b303109644ebdc5bb5fe0be1efd1dd84
    // movie details : https://api.themoviedb.org/3/movie/497698?api_key=b303109644ebdc5bb5fe0be1efd1dd84
    // base URL: https://api.themoviedb.org/3/

    @GET("movie/popular")
    fun getPopularMovie(@Query("page") page: Int): Single<MovieResponse>

    @GET("movie/{movie_id}")
    fun getMovieDetails(@Path("movie_id") id: Int): Single<MovieDetails>
}