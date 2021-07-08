package com.androidplay.ktor

import com.androidplay.ktor.base.configureRouting
import com.androidplay.ktor.base.configureSerialization
import io.ktor.application.*
import io.ktor.locations.*

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

@KtorExperimentalLocationsAPI
@Suppress("unused") // Referenced in application.conf
@kotlin.jvm.JvmOverloads
fun Application.module(testing: Boolean = false) {
    configureStatusPages()
    configureRouting()
    configureSerialization()
}

