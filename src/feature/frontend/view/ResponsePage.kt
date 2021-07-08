package com.androidplay.ktor.feature.frontend.view

import com.androidplay.ktor.base.provider.exception.ExceptionProvider
import com.androidplay.ktor.di.DomainLocator
import com.androidplay.ktor.feature.url.routing.FormUrlLocation
import com.androidplay.ktor.util.BaseResponse
import com.androidplay.ktor.util.isValid
import io.ktor.application.*
import io.ktor.html.*
import io.ktor.http.*
import io.ktor.locations.*
import io.ktor.request.*
import io.ktor.response.*
import io.ktor.routing.*
import kotlinx.html.body
import kotlinx.html.p

/**
 * Created by @Androidplay on Thu 7/8/2021
 */

@KtorExperimentalLocationsAPI
fun Application.responsePage(domainLocator: DomainLocator, exceptionProvider: ExceptionProvider) {

    routing {
        post<FormUrlLocation> {
            val params = call.receiveParameters()
            val url = params["url"] ?: ""
            if (isValid(url)) {
                val response = domainLocator.provideDomainProvider().provideCreateShortUrlUseCase().invoke(url)
                call.respondHtml {
                    body { p { if (response is BaseResponse.SuccessResponse) +"Short url: https://androidplay.in/${response.data}" } }
                }
            } else call.respond(
                HttpStatusCode.BadRequest,
                exceptionProvider.respondWithGenericException("Url is invalid!")
            )
        }
    }
}