package nl.elucidator.graphql.demo.mutation

import com.expediagroup.graphql.annotations.GraphQLDescription
import com.expediagroup.graphql.spring.operations.Mutation
import nl.elucidator.graphql.demo.model.BookImpl
import nl.elucidator.graphql.demo.model.base.Book
import nl.elucidator.graphql.demo.model.CommentImpl
import nl.elucidator.graphql.demo.model.DefaultLocation
import nl.elucidator.graphql.demo.repository.BookRepository
import org.springframework.stereotype.Component

@Component
class BookMutation(val repository: BookRepository) : Mutation {

  @GraphQLDescription("Add a Book")
  fun addBook(title: String, author: String, description: String): Book {
    val d = BookImpl(null, title, author, description, emptyList(), CommentImpl(null, "Comment Type", DefaultLocation(null, 1,1)))
      return repository.save(d) as Book
  }
}
