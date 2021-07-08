package com.androidplay.ktor.base

import com.androidplay.ktor.di.DomainLocator
import com.androidplay.ktor.di.ExceptionLocator
import com.androidplay.ktor.feature.frontend.frontendRouting
import com.androidplay.ktor.feature.url.routing.urlRoutes
import io.ktor.application.*
import io.ktor.locations.*
import io.ktor.routing.*

/**
 * Created by @Androidplay on Thu 7/8/2021
 */

val domainLocator = DomainLocator
val exceptionLocator = ExceptionLocator

@KtorExperimentalLocationsAPI
fun Application.configureRouting() {
    install(Locations)
    routing {
        frontendRouting(domainLocator, exceptionLocator.provideExceptionProvider())
        urlRoutes(domainLocator.provideDomainProvider(), exceptionLocator.provideExceptionProvider())
    }
}