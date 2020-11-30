package nl.elucidator.graphql.demo.model

import nl.elucidator.graphql.demo.model.base.Comment
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.OneToOne
import javax.persistence.Table


@Entity
@Table(name = "COMMENT_DEFAULT")
data class CommentImpl (
    @Id
    @GeneratedValue
    override val id: Long?,
    override val type: String,
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id")
    override val location: DefaultLocation
) : Comment

