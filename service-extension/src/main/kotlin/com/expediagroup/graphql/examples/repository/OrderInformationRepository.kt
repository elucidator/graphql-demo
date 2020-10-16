package com.expediagroup.graphql.examples.repository

import com.expediagroup.graphql.examples.extend.book.OrderInformation
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface OrderInformationRepository : CrudRepository<OrderInformation, Long> {

  fun findByExternalId(externalId: Int) : List<OrderInformation>
}
