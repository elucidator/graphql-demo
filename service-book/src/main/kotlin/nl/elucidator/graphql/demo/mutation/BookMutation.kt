package nl.elucidator.graphql.demo.mutation

import com.expediagroup.graphql.annotations.GraphQLDescription
import com.expediagroup.graphql.spring.operations.Mutation
import nl.elucidator.graphql.demo.model.Book
import nl.elucidator.graphql.demo.repository.BookRepository
import org.springframework.stereotype.Component

@Component
class BookMutation(val repository: BookRepository) : Mutation {

  @GraphQLDescription("Add a Book")
  fun addBook(title: String, author: String, description: String): Book {
      return repository.save(Book(null, title, author, description, emptyList()))
  }
}
