package com.androidplay.ktor.di

import com.androidplay.ktor.base.provider.exception.ExceptionProvider
import com.androidplay.ktor.base.provider.exception.ExceptionProviderImpl

/**
 * Created by @Androidplay on Thu 7/8/2021
 */

object ExceptionLocator {

    fun provideExceptionProvider(): ExceptionProvider = ExceptionProviderImpl()

}