package com.expediagroup.graphql.examples.query

import com.expediagroup.graphql.examples.extend.book.OrderInformation
import com.expediagroup.graphql.examples.repository.OrderInformationRepository
import com.expediagroup.graphql.spring.operations.Query
import org.springframework.stereotype.Component

@Component
class OrderInformationQuery(val repository: OrderInformationRepository) : Query {

  fun getById(id: Long) : OrderInformation = repository.findById(id).get()

}
