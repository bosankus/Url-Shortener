package com.androidplay.ktor.di

import com.androidplay.ktor.base.provider.database.DatabaseProvider
import com.androidplay.ktor.base.provider.database.DatabaseProviderImpl

/**
 * Created by @Androidplay on Thu 7/8/2021
 */

object DatabaseLocator {

    private fun provideClientName(): String = "url-shortener"

    fun provideDatabaseProvider(): DatabaseProvider = DatabaseProviderImpl(provideClientName())
}