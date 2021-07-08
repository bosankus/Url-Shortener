package com.androidplay.ktor.feature.url.entity

import org.bson.codecs.pojo.annotations.BsonId
import org.bson.types.ObjectId

/**
 * Created by @Androidplay on Thu 7/8/2021
 */
data class UrlEntity(
    @BsonId
    val urlId: String = ObjectId().toString(),
    val originalUrl: String,
    val shortUrl: String,
    val createdAt: String,
    val urlHitCount: Int = 0
) {
    companion object {
        const val URL = "/v1/url"
        const val URL_COUNT = "/v1/{url}/count"
        const val SHORT_URL = "/{url}"
    }
}