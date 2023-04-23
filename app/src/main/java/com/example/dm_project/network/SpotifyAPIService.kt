package com.example.dm_project.network

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

/**
 * Student ID: 991555778
 * DM_Project
 * created by davidromero
 * on 2023-04-21
 **/



interface SpotifyAPIService{

    @Headers(
        "X-RapidAPI-Key: 8388516373msh1227ac17fbff7f3p1069c8jsna28adae39e46"
    )
    @GET("/artists/{ids}")
    fun getArtist(@Query("ids") ids: String): Call<List<ArtistX>>



}

