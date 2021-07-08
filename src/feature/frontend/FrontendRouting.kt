package com.androidplay.ktor.feature.frontend

import com.androidplay.ktor.base.provider.domain.DomainProvider
import com.androidplay.ktor.base.provider.exception.ExceptionProvider
import com.androidplay.ktor.di.DomainLocator
import com.androidplay.ktor.feature.frontend.view.landingPage
import com.androidplay.ktor.feature.frontend.view.responsePage
import io.ktor.application.*
import io.ktor.locations.*
import io.ktor.routing.*

/**
 * Created by @Androidplay on Thu 7/8/2021
 */

@KtorExperimentalLocationsAPI
fun Application.frontendRouting(domainLocator: DomainLocator, exceptionProvider: ExceptionProvider) {

    routing {
        landingPage()
        responsePage(domainLocator, exceptionProvider)
    }
}