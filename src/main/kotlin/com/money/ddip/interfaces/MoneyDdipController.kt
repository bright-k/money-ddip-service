package com.money.ddip.interfaces

import com.money.ddip.application.MoneyDdipService
import com.money.ddip.interfaces.model.ApiResponse
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestHeader
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

/**
 *  Created by eastbright on 2021/03/14
 */

@RequestMapping("/v1/ddip")
@RestController
class MoneyDdipController(
    private val ddipService: MoneyDdipService
) {

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    fun createMoneyDdip(
        @RequestHeader(HEADER_ROOM_ID) roomId: Long,
        @RequestHeader(HEADER_USER_ID) userId: Long
    ): ApiResponse<Any> {
        return ApiResponse(true, null)
    }

    @ResponseStatus(HttpStatus.OK)
    @PostMapping("/take/{token}")
    fun takeMoneyDdip(
        @RequestHeader(HEADER_ROOM_ID) roomId: Long,
        @RequestHeader(HEADER_USER_ID) userId: Long,
        @PathVariable("token") token: String
    ): ApiResponse<Any> {
        return ApiResponse(true, null)
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{token}")
    fun getMoneyDdip(
        @RequestHeader(HEADER_ROOM_ID) roomId: Long,
        @RequestHeader(HEADER_USER_ID) userId: Long,
        @PathVariable("token") token: String
    ): ApiResponse<Any> {
        return ApiResponse(true, null)
    }

    companion object {
        private const val HEADER_USER_ID = "X-USER-ID"
        private const val HEADER_ROOM_ID = "X-ROOM-ID"
    }
}
