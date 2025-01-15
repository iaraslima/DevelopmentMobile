package com.example.toastapp.data

import com.example.toastapp.data.models.CreatePostRequest
import com.example.toastapp.data.models.Post
import com.example.toastapp.data.models.User
import com.example.toastapp.data.models.UserCreateRequest

interface ApiService {
    @POST("users/")
    suspend fun createUser(@Body user: UserCreateRequest): User

    @GET("users/")
    suspend fun getUsers(): List<User>

    @POST("users/{user_id}/posts/"){
        suspend fun createPost(
            @Path("user_id") userId: Int,
            @Body post: CreatePostRequest
        ): Post

        @GET("users/{user_id}/posts")
        suspend fun getPosts(
            @Path("user_id") userId: Int
        ): List<Post>

        @PUT("posts/{post_id}")
        suspend fun updatePost(
            @Path("post_id") postId: Int,
            @Body post: CreatePostRequest
        ): Post

        @DELETE("posts/{post_id}")
        suspend fun deletePost(@Path("post_id") postId: Int): Unit {
        }
    }
}