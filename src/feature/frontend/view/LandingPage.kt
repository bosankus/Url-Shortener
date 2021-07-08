package com.androidplay.ktor.feature.frontend.view

import com.androidplay.ktor.feature.url.entity.UrlEntity
import io.ktor.application.*
import io.ktor.html.*
import io.ktor.routing.*
import kotlinx.html.*

/**
 * Created by @Androidplay on Thu 7/8/2021
 */

fun Application.landingPage() {

    routing {
        get("/url-shortener") {
            call.respondHtml {
                head { title { "Androidplay | URL Shortener" } }
                body {
                    form(action = UrlEntity.FORM_URL, method = FormMethod.post) {
                        label {
                            input(type = InputType.url, name = "Url") {
                                placeholder = "Enter your url"
                                required = true
                            }
                        }
                        button(classes = "primary", type = ButtonType.submit) { +"Shorten" }
                    }
                }
            }
        }
    }
}