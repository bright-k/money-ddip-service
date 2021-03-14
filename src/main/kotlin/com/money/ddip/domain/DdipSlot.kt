package com.money.ddip.domain

import java.time.Instant
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.Id
import javax.persistence.IdClass
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.MapsId
import javax.persistence.Table

/**
 *  Created by eastbright on 2021/03/14
 */

@Table(name = "ddip_slot")
@IdClass(DdipSlotId::class)
@Entity
open class DdipSlot(
    @MapsId
    @JoinColumn(name = "ddip_id", updatable = false, nullable = false, referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    open var ddip: Ddip,
    @Id
    @Column(name = "ddip_id", insertable = false, updatable = false)
    open var ddipId: Long,
    @Id
    @Column(name = "slot", insertable = false, updatable = false)
    open var slot: Int,
    @Column(name = "amount")
    open var amount: Int,
    @Column(name = "taken_user_id")
    open var takenUserId: Long? = null,
    @Column(name = "created_at")
    open var createdAt: Instant = Instant.now()
) {
}
