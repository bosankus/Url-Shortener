package com.androidplay.ktor.base

import com.androidplay.ktor.util.BaseResponse

/**
 * Created by @Androidplay on Thu 7/8/2021
 */

interface BaseUseCase<in I, R : Any> {

    suspend operator fun invoke(input: I): BaseResponse<R>
}