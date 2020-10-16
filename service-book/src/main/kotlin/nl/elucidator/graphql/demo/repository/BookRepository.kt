package nl.elucidator.graphql.demo.repository

import nl.elucidator.graphql.demo.model.Book
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface BookRepository : CrudRepository<Book, Long> {

  fun findAllById(id: Long) : List<Book>
}
