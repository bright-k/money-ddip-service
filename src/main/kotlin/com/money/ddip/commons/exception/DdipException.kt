package com.money.ddip.commons.exception

import com.money.ddip.interfaces.model.ApiResponse
import com.money.ddip.interfaces.model.ErrorResponse
import java.lang.RuntimeException

/**
 *  Created by eastbright on 2021/03/14
 */
open class DdipException(
    val errorType: ErrorType
) : RuntimeException(errorType.message) {
    fun toApiResponse() = ApiResponse(
        result = false,
        data = ErrorResponse(
            code = errorType.code,
            message = errorType.message
        )
    )
}

class InternalServerException(errorType: ErrorType = ErrorType.INTERNAL_SERVER_ERROR) : DdipException(errorType)
