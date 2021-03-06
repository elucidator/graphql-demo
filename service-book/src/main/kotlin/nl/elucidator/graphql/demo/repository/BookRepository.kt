package nl.elucidator.graphql.demo.repository

import nl.elucidator.graphql.demo.model.base.Book
import nl.elucidator.graphql.demo.model.base.BookImpl
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface BookRepository : CrudRepository<BookImpl, Long> {

  fun findAllById(id: Long) : List<Book>
}
