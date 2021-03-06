package com.androidplay.ktor.util

import java.net.URL
import java.util.*

/**
 * Created by @Androidplay on Thu 7/8/2021
 */

fun currentDateInstant(): String = Date().toInstant().toString()

fun generateRandomUrl(length: Int = 6): String {
    val allowedChars = ('A'..'Z') + ('a'..'z') + ('0'..'9')
    return (1..length)
        .map { allowedChars.random() }
        .joinToString("")
}

fun isValid(url: String?): Boolean {
    return try {
        URL(url).toURI()
        true
    } catch (e: Exception) {
        false
    }
}