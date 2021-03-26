package com.example.ws_mobile_whatch

data class AuthResponse(
    val token: Int
)

data class CommentForm(
    val text: String
)

data class User(
    val userId: String,
    val firstName: String,
    val lastName: String,
    val email: String,
    val avatar: String
)

data class EpisodeTime(
    val time: String
)

data class UserForm(
    val firstName: String,
    val lastName: String,
    val password: String
)

data class CoverMovie(
    val movieId: String,
    val backgroundImage: String,
    val foregroundImage: String
)

data class Movie(
    val movieId: String,
    val name: String,
    val description: String,
    val age: String,
    val images: List<String>,
    val poster: String,
    val tags: List<Map<String, String>>
)

data class Episode(
    val episodeId: String,
    val name: String,
    val description: String,
    val director: String,
    val stars: String,
    val year: String,
    val images: List<String>,
    val runtime: String,
    val preview: String,
    val moviesId: String
)