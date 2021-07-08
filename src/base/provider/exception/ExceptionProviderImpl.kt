package com.androidplay.ktor.base.provider.exception

import com.androidplay.ktor.NotFoundException
import com.androidplay.ktor.SomethingWentWrongException

/**
 * Created by @Androidplay on Thu 7/8/2021
 */

class ExceptionProviderImpl : ExceptionProvider {

    override fun respondWithNotFoundException(message: String?): Exception {
        return NotFoundException(message)
    }

    override fun respondWithGenericException(message: String?): Exception {
        return Exception(message)
    }

    override fun respondWithSomethingWentWrongException(): Exception {
        return SomethingWentWrongException()
    }
}