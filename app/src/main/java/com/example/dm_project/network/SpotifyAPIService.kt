package com.example.dm_project.network

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET
import retrofit2.http.Headers

/**
 * Student ID: 991555778
 * DM_Project
 * created by davidromero
 * on 2023-04-21
 **/

private val BASE_URL = "https://spotify23.p.rapidapi.com/artists/?ids=2w9zwq3AktTeYYMuhMjju8"
/*private const val RAPIDAPI_KEY = "8388516373msh1227ac17fbff7f3p1069c8jsna28adae39e46"
private const val RAPIDAPI_HOST = "spotify23.p.rapidapi.com"*/

/*
Create Retrofit object and tell it to fetch data from webservice,
aswell as be able to read JSON response; which is needed in RESTful API's
*/
private val moshi = Moshi.Builder()
    .add(KotlinJsonAdapterFactory())
    .build()

private val retrofit = Retrofit.Builder()
    .addConverterFactory(MoshiConverterFactory.create(moshi))
    .baseUrl(BASE_URL)
    .build()

interface SpotifyApiService { //Fetch artist spoitfy ID given string name
    /*@Headers(
        "X-RapidAPI-Key: 8388516373msh1227ac17fbff7f3p1069c8jsna28adae39e46",
        "X-RapidAPI-Host: spotify23.p.rapidapi.com"
    )
    @GET("/artists/images")*/
    //suspend fun getSpotifyImages(): List<SpotifyImage>

    /*@GET("/artists/images")
    fun getArtistID(): List<SpotifyID>*/ //TODO: Add later
}

object SpotifyAPI {
    val retrofitService: SpotifyApiService by lazy { retrofit.create(SpotifyApiService::class.java) }
}