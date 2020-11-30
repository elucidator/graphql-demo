package nl.elucidator.graphql.demo.model

import nl.elucidator.graphql.demo.model.base.Location
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "DEFAULT_LOCATION")
data class DefaultLocation(
    @Id
    @GeneratedValue
    val id: Long?,
    val x: Int,
    val y: Int
) : Location
