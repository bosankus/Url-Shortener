package com.androidplay.ktor.feature.url.domain

import com.androidplay.ktor.feature.url.repository.UrlRepository

/**
 * Created by @Androidplay on Thu 7/8/2021
 */

class FindShortUrlUseCase(private val urlRepository: UrlRepository) {

    suspend fun invoke(input: String): String? {
        return urlRepository.findOriginalUrl(input)
    }
}