package com.money.ddip.domain

import java.io.Serializable
import javax.persistence.Column
import javax.persistence.Id

/**
 *  Created by eastbright on 2021/03/14
 */
data class DdipSlotId(
    @Id
    @Column(name = "ddip_id")
    val ddipId: Long,
    @Id
    @Column(name = "slot")
    val slot: Int
) : Serializable
