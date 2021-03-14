package com.money.ddip.domain

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Lock
import org.springframework.stereotype.Repository
import javax.persistence.LockModeType

/**
 *  Created by eastbright on 2021/03/14
 */

@Repository
interface DdipRepository : JpaRepository<Ddip, Long> {
    @Lock(value = LockModeType.PESSIMISTIC_WRITE)
    fun findWithLockByRoomIdAndToken(roomId: Long, token: String): Ddip
    fun findByRoomIdAndToken(roomId: Long, token: String): Ddip
}
