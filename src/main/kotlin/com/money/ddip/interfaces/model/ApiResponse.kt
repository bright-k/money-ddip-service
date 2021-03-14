package com.money.ddip.interfaces.model

/**
 *  Created by eastbright on 2021/03/14
 */
data class ApiResponse<T>(
    val result: Boolean = true,
    val data: T?
)
