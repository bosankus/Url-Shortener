package com.androidplay.ktor.util

import java.util.*

/**
 * Created by @Androidplay on Thu 7/8/2021
 */

fun currentDateInstant(): String = Date().toInstant().toString()

fun generateRandomUrl(lenght: Int = 6): String {
    val allowedChars = ('A'..'Z') + ('a'..'z') + ('0'..'9')
    return (1..lenght)
        .map { allowedChars.random() }
        .joinToString("")
}