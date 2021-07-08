package com.androidplay.ktor.feature.url.repository

import com.androidplay.ktor.util.BaseResponse

/**
 * Created by @Androidplay on Thu 7/8/2021
 */

interface UrlRepository {

    suspend fun createShortUrl(originUrl: String): BaseResponse<Any>

    suspend fun findOriginalUrl(shortUrl: String): String?

    suspend fun getTotalCount(shortUrl: String): BaseResponse<Any>
}