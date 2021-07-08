package com.androidplay.ktor.base.provider.service

import com.androidplay.ktor.di.DatabaseLocator
import com.androidplay.ktor.feature.url.service.UrlService
import com.androidplay.ktor.feature.url.service.UrlServiceImpl

/**
 * Created by @Androidplay on Thu 7/8/2021
 */

class ServiceProviderImpl(private val databaseLocator: DatabaseLocator) : ServiceProvider {

    override fun provideUrlService(): UrlService {
        return UrlServiceImpl(databaseLocator.provideDatabaseProvider().urlCollection)
    }
}