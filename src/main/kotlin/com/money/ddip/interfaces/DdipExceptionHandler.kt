package com.money.ddip.interfaces

import com.money.ddip.commons.exception.DdipException
import com.money.ddip.commons.exception.InternalServerException
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice
import javax.servlet.http.HttpServletRequest

/**
 *  Created by eastbright on 2021/03/14
 */

@RestControllerAdvice
class DdipExceptionHandler {
    @ExceptionHandler(DdipException::class)
    fun handleDdipException(request: HttpServletRequest, e: DdipException): ResponseEntity<*> {
        return ResponseEntity(e.toApiResponse(), HttpStatus.valueOf(e.errorType.status))
    }

    @ExceptionHandler(Exception::class)
    fun handleException(request: HttpServletRequest, e: Exception): ResponseEntity<*> {
        return ResponseEntity(InternalServerException().toApiResponse(), HttpStatus.INTERNAL_SERVER_ERROR)
    }
}
