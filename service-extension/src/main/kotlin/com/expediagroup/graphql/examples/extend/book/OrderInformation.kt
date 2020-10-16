package com.expediagroup.graphql.examples.extend.book

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "ORDER_INFO")
data class OrderInformation(
    @Id
    @GeneratedValue
    val id: Int?,
    val externalId: Int,
    val isbn: String,
    val provider: String,
    val price: Long,
    val time: Long
)
