package com.expediagroup.graphql.examples.extend.book

import com.expediagroup.graphql.annotations.GraphQLDescription
import com.expediagroup.graphql.federation.directives.ExtendsDirective
import com.expediagroup.graphql.federation.directives.ExternalDirective
import com.expediagroup.graphql.federation.directives.FieldSet
import com.expediagroup.graphql.federation.directives.KeyDirective

@KeyDirective(fields = FieldSet("id"))
@ExtendsDirective
data class Book (
  @ExternalDirective
  val id: Long?,
  @GraphQLDescription("List of providers of the book")
  val orderInformation: List<OrderInformation>
)
