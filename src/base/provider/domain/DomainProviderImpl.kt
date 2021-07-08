package com.androidplay.ktor.base.provider.domain

import com.androidplay.ktor.base.provider.repository.RepositoryProvider
import com.androidplay.ktor.feature.url.domain.CreateShortUrlUseCase
import com.androidplay.ktor.feature.url.domain.FindShortUrlUseCase
import com.androidplay.ktor.feature.url.domain.FindUrlHitCountUseCase

/**
 * Created by @Androidplay on Thu 7/8/2021
 */

class DomainProviderImpl(private val repositoryProvider: RepositoryProvider) : DomainProvider {

    override fun provideCreateShortUrlUseCase(): CreateShortUrlUseCase {
        return CreateShortUrlUseCase(repositoryProvider.provideUrlRepository())
    }

    override fun provideFindShortUrlUseCase(): FindShortUrlUseCase {
        return FindShortUrlUseCase(repositoryProvider.provideUrlRepository())
    }

    override fun provideFindUrlHitCountUseCase(): FindUrlHitCountUseCase {
        return FindUrlHitCountUseCase(repositoryProvider.provideUrlRepository())
    }
}