package nl.elucidator.graphql.demo.model.base

interface Review {
   val id: Long
    val author: String
    val rating: Int
    val comments: String
}
