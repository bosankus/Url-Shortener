package com.androidplay.ktor.feature.url.domain

import com.androidplay.ktor.base.provider.BaseUseCase
import com.androidplay.ktor.feature.url.repository.UrlRepository
import com.androidplay.ktor.util.BaseResponse

/**
 * Created by @Androidplay on Thu 7/8/2021
 */

class FindUrlHitCountUseCase(private val urlRepository: UrlRepository) : BaseUseCase<String, Any> {

    override suspend fun invoke(input: String): BaseResponse<Any> {
        return urlRepository.getTotalCount(input)
    }
}