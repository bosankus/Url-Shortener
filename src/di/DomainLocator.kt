package com.androidplay.ktor.di

import com.androidplay.ktor.base.provider.domain.DomainProvider
import com.androidplay.ktor.base.provider.domain.DomainProviderImpl

/**
 * Created by @Androidplay on Thu 7/8/2021
 */

object DomainLocator {

    fun provideDomainProvider(): DomainProvider = DomainProviderImpl(RepositoryLocator.provideRepositoryProvider())
}