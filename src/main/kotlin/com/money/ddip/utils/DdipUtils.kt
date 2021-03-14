package com.money.ddip.utils

import org.apache.commons.lang3.RandomStringUtils

/**
 *  Created by eastbright on 2021/03/14
 */
object DdipUtils {
    fun getRandomToken(length: Int = 3): String {
        return RandomStringUtils.randomAlphanumeric(length)
    }
}
