package com.money.ddip.commons.exception

/**
 *  Created by eastbright on 2021/03/14
 */
enum class ErrorType(
    val status: Int,
    val code: String,
    val message: String
) {
    ALREADY_FINISHED(400, "ME1001", "이미 종료되었습니다."),

    INTERNAL_SERVER_ERROR(500, "ME9999", "서버에 문제가 생겼어요."),
}
