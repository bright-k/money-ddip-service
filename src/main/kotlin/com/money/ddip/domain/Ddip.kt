package com.money.ddip.domain

import com.money.ddip.utils.DdipUtils
import java.time.Instant
import javax.persistence.CascadeType
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.OneToMany
import javax.persistence.OrderBy
import javax.persistence.Table

/**
 *  Created by eastbright on 2021/03/14
 */

@Table(name = "ddip")
@Entity
open class Ddip(
    @Column(name = "room_id")
    open val roomId: Long,
    @Column(name = "request_user_id")
    open val requestUserId: Long,
    @Column(name = "token")
    open val token: String,
    @Column(name = "member_count")
    open val memberCount: Int,
    @Column(name = "amount")
    open val amount: Int,
    @Column(name = "created_at")
    open val createdAt: Instant = Instant.now()
) {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    open val id: Long = 0

    @OneToMany(
        mappedBy = "ddip",
        fetch = FetchType.EAGER,
        cascade = [CascadeType.PERSIST, CascadeType.PERSIST, CascadeType.REMOVE],
        orphanRemoval = true
    )
    @OrderBy("slot")
    open var slots: MutableList<DdipSlot> = mutableListOf()

    companion object {
        fun newDdip(
            roomId: Long,
            requestUserId: Long,
            memberCount: Int,
            amount: Int
        ): Ddip {
            return Ddip(
                roomId = roomId,
                requestUserId = requestUserId,
                token = DdipUtils.getRandomToken(3),
                memberCount = memberCount,
                amount = amount,
            ).apply {
                val list = mutableListOf<DdipSlot>()
                for (i in 1..memberCount) {

                }
                slots = list
            }
        }
    }
}
