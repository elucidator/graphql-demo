package com.expediagroup.graphql.examples.extend.book

import com.expediagroup.graphql.examples.repository.OrderInformationRepository
import com.expediagroup.graphql.federation.execution.FederatedTypeResolver
import graphql.schema.DataFetchingEnvironment
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class BookResolver() : FederatedTypeResolver<Book> {
  @Autowired
  var repository: OrderInformationRepository?  = null
  //This needs to be the name of the Type you are extending!
  override val typeName: String = "Book"

  override suspend fun resolve(environment: DataFetchingEnvironment, representations: List<Map<String, Any>>): List<Book?> = representations.map {
    val externalId = it["id"] as Int


      Book(externalId.toLong(), repository?.findByExternalId(externalId) ?: emptyList())
  }
}
