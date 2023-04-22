package com.example.dm_project.network

import android.media.Image
import com.beust.klaxon.Klaxon
import com.squareup.moshi.Json

/**
 * Student ID: 991555778
 * DM_Project
 * created by davidromero
 * on 2023-04-21
 **/







private val klaxon = Klaxon()

data class Welcome5 (
    val artists: List<Artist>
) {
    public fun toJson() = klaxon.toJsonString(this)

    companion object {
        public fun fromJson(json: String) = klaxon.parse<Welcome5>(json)
    }
}

data class Artist (
    @Json(name = "external_urls")
    val externalUrls: ExternalUrls,

    val followers: Followers,
    val genres: List<String>,
    val id: String,
    val images: List<Image>,
    val name: String,
    val popularity: Long,
    val type: String,
    val uri: String
)

data class ExternalUrls (
    val spotify: String
)

data class Followers (
    val href: Any? = null,
    val total: Long
)

data class Image (
    val height: Long,
    val url: String,
    val width: Long
)