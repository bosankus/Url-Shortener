package com.androidplay.ktor.base.provider.repository

import com.androidplay.ktor.feature.url.repository.UrlRepository

/**
 * Created by @Androidplay on Thu 7/8/2021
 */

interface RepositoryProvider {

    fun provideUrlRepository(): UrlRepository
}