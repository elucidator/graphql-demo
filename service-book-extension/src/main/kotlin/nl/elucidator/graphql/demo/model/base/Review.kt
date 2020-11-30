package nl.elucidator.graphql.demo.model.base

import com.expediagroup.graphql.annotations.GraphQLDescription
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "REVIEW")
@GraphQLDescription("Review for a Book")
data class Review(
    @Id
    @GeneratedValue
    val id: Long,
    val author: String,
    val rating: Int,
    val comments: String
)
