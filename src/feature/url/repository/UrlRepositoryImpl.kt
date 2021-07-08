package com.androidplay.ktor.feature.url.repository

import com.androidplay.ktor.base.provider.exception.ExceptionProvider
import com.androidplay.ktor.feature.url.service.UrlService
import com.androidplay.ktor.util.BaseResponse
import io.ktor.http.*

/**
 * Created by @Androidplay on Thu 7/8/2021
 */
class UrlRepositoryImpl(
    private val urlService: UrlService,
    private val exceptionProvider: ExceptionProvider
) : UrlRepository {

    override suspend fun createShortUrl(originUrl: String): BaseResponse<Any> {
        val url = urlService.findShortUrl(originUrl)
        return if (url != null) BaseResponse.SuccessResponse(HttpStatusCode.Found, url)
        else {
            val newShortUrl = urlService.createShortUrl(originUrl)
            BaseResponse.SuccessResponse(HttpStatusCode.Created, newShortUrl)
        }
    }


    override suspend fun findOriginalUrl(shortUrl: String): String? {
        return urlService.findOriginalUrl(shortUrl)
    }


    override suspend fun getTotalCount(shortUrl: String): BaseResponse<Any> {
        val count = urlService.getTotalCount(shortUrl)
        return if (count != null) BaseResponse.SuccessResponse(HttpStatusCode.OK, count)
        else throw exceptionProvider.respondWithNotFoundException("Url not found!")

    }

}