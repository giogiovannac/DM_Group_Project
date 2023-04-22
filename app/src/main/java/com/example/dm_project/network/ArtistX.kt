package com.example.dm_project.network

data class ArtistX(
    val external_urls: ExternalUrls,
    val followers: Followers,
    val genres: List<String>,
    val id: String,
    val images: List<Image>,
    val name: String,
    val popularity: Int,
    val type: String,
    val uri: String
)