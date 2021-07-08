package com.androidplay.ktor.di

import com.androidplay.ktor.base.provider.service.ServiceProvider
import com.androidplay.ktor.base.provider.service.ServiceProviderImpl
import com.androidplay.ktor.feature.url.service.UrlService

/**
 * Created by @Androidplay on Thu 7/8/2021
 */
object ServiceLocator {

    private fun provideServiceProvider(): ServiceProvider = ServiceProviderImpl(DatabaseLocator)

    fun provideUrlService(): UrlService = provideServiceProvider().provideUrlService()
}