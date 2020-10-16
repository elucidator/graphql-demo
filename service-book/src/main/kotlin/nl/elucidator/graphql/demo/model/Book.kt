package nl.elucidator.graphql.demo.model

import com.expediagroup.graphql.annotations.GraphQLDescription
import com.expediagroup.graphql.federation.directives.FieldSet
import com.expediagroup.graphql.federation.directives.KeyDirective
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.JoinTable
import javax.persistence.OneToMany
import javax.persistence.Table

@KeyDirective(fields = FieldSet("id"))
@GraphQLDescription("Book Information")
@Entity
@Table(name = "BOOK")
data class Book (
    @Id
    @GeneratedValue
    val id: Long?,
    @GraphQLDescription("The Title")
    val title: String,
    val author: String,
    val description: String,
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "id")
    val reviews: List<Review>
)
