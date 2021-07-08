package com.androidplay.ktor.feature.url.routing

import com.androidplay.ktor.base.provider.domain.DomainProvider
import com.androidplay.ktor.base.provider.exception.ExceptionProvider
import com.androidplay.ktor.feature.url.request.UrlRequest
import com.androidplay.ktor.util.isValid
import io.ktor.application.*
import io.ktor.http.*
import io.ktor.locations.*
import io.ktor.request.*
import io.ktor.response.*
import io.ktor.routing.*

/**
 * Created by @Androidplay on Thu 7/8/2021
 */

@KtorExperimentalLocationsAPI
fun Application.urlRoutes(domainProvider: DomainProvider, exceptionProvider: ExceptionProvider) {

    routing {
        post<UrlLocation> {
            val urlRequest = call.receive<UrlRequest>()
            if (isValid(urlRequest.url)) {
                val response = domainProvider.provideCreateShortUrlUseCase().invoke(urlRequest.url)
                call.respond(response)
            } else {
                call.respond(
                    HttpStatusCode.BadRequest,
                    exceptionProvider.respondWithGenericException("Url is not valid!")
                )
            }
        }

        get<ShortUrlLocation> { request ->
            val shortUrl = request.url
            val response = domainProvider.provideFindShortUrlUseCase().invoke(shortUrl)
            if (response != null) call.respondRedirect(response)
            else call.respond(
                HttpStatusCode.NotFound,
                exceptionProvider.respondWithNotFoundException("Url not found!")
            )
        }

        get<UrlCount> { request ->
            val shortUrl = request.url
            val response = domainProvider.provideFindUrlHitCountUseCase().invoke(shortUrl)
            call.respond(response)
        }
    }
}