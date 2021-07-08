package com.androidplay.ktor.base.provider.database

import com.androidplay.ktor.feature.url.entity.UrlEntity
import org.litote.kmongo.coroutine.CoroutineClient
import org.litote.kmongo.coroutine.CoroutineCollection
import org.litote.kmongo.coroutine.CoroutineDatabase

/**
 * Created by @Androidplay on Thu 7/8/2021
 */
interface DatabaseProvider {

    val initializeName: String

    val mongoClient: CoroutineClient

    val database: CoroutineDatabase

    val urlCollection: CoroutineCollection<UrlEntity>
}