package com.androidplay.ktor.base.provider.database

import com.androidplay.ktor.feature.url.entity.UrlEntity
import org.litote.kmongo.coroutine.CoroutineClient
import org.litote.kmongo.coroutine.CoroutineCollection
import org.litote.kmongo.coroutine.CoroutineDatabase
import org.litote.kmongo.coroutine.coroutine
import org.litote.kmongo.reactivestreams.KMongo

/**
 * Created by @Androidplay on Thu 7/8/2021
 */

class DatabaseProviderImpl(private val clientName: String) : DatabaseProvider {

    override val initializeName: String
        get() = clientName

    override val mongoClient: CoroutineClient
        get() = KMongo.createClient().coroutine

    override val database: CoroutineDatabase
        get() = mongoClient.getDatabase(initializeName)

    override val urlCollection: CoroutineCollection<UrlEntity>
        get() = database.getCollection()
}