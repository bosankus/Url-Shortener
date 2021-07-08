package com.androidplay.ktor.feature.url.routing

import com.androidplay.ktor.feature.url.entity.UrlEntity
import io.ktor.locations.*
import io.ktor.util.*

/**
 * Created by @Androidplay on Thu 7/8/2021
 */

@KtorExperimentalLocationsAPI
@Location(UrlEntity.URL)
class UrlLocation

@KtorExperimentalLocationsAPI
@Location(UrlEntity.FORM_URL)
class FormUrlLocation

@KtorExperimentalLocationsAPI
@Location(UrlEntity.SHORT_URL)
data class ShortUrlLocation(val url: String)

@KtorExperimentalLocationsAPI
@Location(UrlEntity.URL_COUNT)
data class UrlCount(val url: String)

