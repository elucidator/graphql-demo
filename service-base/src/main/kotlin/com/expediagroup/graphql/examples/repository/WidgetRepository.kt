package com.expediagroup.graphql.examples.repository

import com.expediagroup.graphql.examples.model.Widget
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface WidgetRepository : CrudRepository<Widget, Int>{
}
