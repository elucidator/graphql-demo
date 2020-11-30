package nl.elucidator.graphql.demo.model

import com.expediagroup.graphql.annotations.GraphQLDescription
import com.expediagroup.graphql.federation.directives.FieldSet
import com.expediagroup.graphql.federation.directives.KeyDirective
import nl.elucidator.graphql.demo.model.base.Book
import nl.elucidator.graphql.demo.model.base.Comment
import nl.elucidator.graphql.demo.model.base.Review

import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.OneToMany
import javax.persistence.OneToOne
import javax.persistence.Table

@KeyDirective(fields = FieldSet("id"))
@GraphQLDescription("Book Information")
@Entity
@Table(name = "BOOK")
data class BookImpl(

    @Id
    @GeneratedValue
    override val id: Long?,

    @GraphQLDescription("The Title")
    override val title: String,
    override val author: String,
    override val description: String,

    @OneToMany(fetch = FetchType.EAGER, targetEntity = ReviewImpl::class)
    @JoinColumn(name = "id")
    override val reviews: List<Review>,

    @OneToOne(fetch = FetchType.EAGER, targetEntity = CommentImpl::class)
    @JoinColumn(name = "id")
    override val comments: Comment
) : Book
