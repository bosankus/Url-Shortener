package com.androidplay.ktor.base.provider.domain

import com.androidplay.ktor.feature.url.domain.CreateShortUrlUseCase
import com.androidplay.ktor.feature.url.domain.FindShortUrlUseCase
import com.androidplay.ktor.feature.url.domain.FindUrlHitCountUseCase

/**
 * Created by @Androidplay on Thu 7/8/2021
 */

interface DomainProvider {

    fun provideCreateShortUrlUseCase(): CreateShortUrlUseCase

    fun provideFindShortUrlUseCase(): FindShortUrlUseCase

    fun provideFindUrlHitCountUseCase(): FindUrlHitCountUseCase
}