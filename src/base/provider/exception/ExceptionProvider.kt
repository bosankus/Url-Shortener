package com.androidplay.ktor.base.provider.exception

/**
 * Created by @Androidplay on Thu 7/8/2021
 */
interface ExceptionProvider {

    fun respondWithNotFoundException(message: String?): Exception

    fun respondWithGenericException(message: String?): Exception

    fun respondWithSomethingWentWrongException(): Exception

}