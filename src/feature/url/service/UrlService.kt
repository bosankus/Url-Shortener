package com.androidplay.ktor.feature.url.service

/**
 * Created by @Androidplay on Thu 7/8/2021
 */

interface UrlService {

    suspend fun createShortUrl(url: String): String?

    suspend fun findShortUrl(url: String): String?

    suspend fun findOriginalUrl(url: String): String?

    suspend fun checkIfUrlIsPresent(url: String): Boolean

    suspend fun getTotalCount(url: String): Int?
}