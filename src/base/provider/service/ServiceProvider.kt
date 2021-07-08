package com.androidplay.ktor.base.provider.service

import com.androidplay.ktor.feature.url.service.UrlService

/**
 * Created by @Androidplay on Thu 7/8/2021
 */
interface ServiceProvider {

    fun provideUrlService(): UrlService
}