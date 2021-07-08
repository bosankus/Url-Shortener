package com.androidplay.ktor.di

import com.androidplay.ktor.base.provider.repository.RepositoryProvider
import com.androidplay.ktor.base.provider.repository.RepositoryProviderImpl
import com.androidplay.ktor.feature.url.repository.UrlRepository
import com.androidplay.ktor.feature.url.repository.UrlRepositoryImpl
import com.androidplay.ktor.feature.url.service.UrlService

/**
 * Created by @Androidplay on Thu 7/8/2021
 */
object RepositoryLocator {

    fun provideUrlRepository(urlService: UrlService): UrlRepository =
        UrlRepositoryImpl(urlService, ExceptionLocator.provideExceptionProvider())

    fun provideRepositoryProvider(): RepositoryProvider = RepositoryProviderImpl(ServiceLocator)
}