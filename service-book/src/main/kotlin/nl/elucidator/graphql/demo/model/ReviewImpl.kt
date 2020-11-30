package nl.elucidator.graphql.demo.model

import com.expediagroup.graphql.annotations.GraphQLDescription
import nl.elucidator.graphql.demo.model.base.Review
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "REVIEW")
@GraphQLDescription("Review for a Book")
data class ReviewImpl (
    @Id
    @GeneratedValue
    override val id: Long,
    override val author: String,
    override val rating: Int,
    override val comments: String
) : Review
