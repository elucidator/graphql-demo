package nl.elucidator.graphql.demo.query
import com.expediagroup.graphql.annotations.GraphQLDescription
import com.expediagroup.graphql.spring.operations.Query
import nl.elucidator.graphql.demo.repository.BookRepository
import nl.elucidator.graphql.demo.SchemaGenerator
import nl.elucidator.graphql.demo.model.base.Book
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Component

@Component
class BookQuery(val repository: BookRepository) : Query {


  @GraphQLDescription("creates new Book for given ID")
  fun bookById(
      @GraphQLDescription("The special ingredient") id: Long
  ): Book? = repository.findByIdOrNull(id)
}
