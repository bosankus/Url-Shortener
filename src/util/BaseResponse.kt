package com.androidplay.ktor.util

import io.ktor.http.*

/**
 * Created by @Androidplay on Thu 7/8/2021
 */

interface BaseResponse<T : Any> {

    data class SuccessResponse<T : Any>(
        val statusCode: HttpStatusCode,
        val data: T? = null
    ) : BaseResponse<T>

    data class FailResponse<T : Any>(
        val statusCode: HttpStatusCode,
        val exception: T? = null
    ) : BaseResponse<T>
}