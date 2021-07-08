package com.androidplay.ktor.base.provider.repository

import com.androidplay.ktor.di.RepositoryLocator
import com.androidplay.ktor.di.ServiceLocator
import com.androidplay.ktor.feature.url.repository.UrlRepository

/**
 * Created by @Androidplay on Thu 7/8/2021
 */

class RepositoryProviderImpl(private val serviceLocator: ServiceLocator) : RepositoryProvider {

    override fun provideUrlRepository(): UrlRepository {
        return RepositoryLocator.provideUrlRepository(
            serviceLocator.provideUrlService()
        )
    }

}