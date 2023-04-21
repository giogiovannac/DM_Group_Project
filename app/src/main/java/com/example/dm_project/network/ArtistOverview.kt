package com.example.dm_project.network

import com.squareup.moshi.Json

/**
 * Student ID: 991555778
 * DM_Project
 * created by davidromero
 * on 2023-04-21
 **/

//Class used to handle Spotify Artist information
data class ArtistOverview(
    val id: String,
    // used to map img_src from the JSON to imgSrcUrl in our class
    //@Json(name = "img_src") val imgSrcUrl: String

)
