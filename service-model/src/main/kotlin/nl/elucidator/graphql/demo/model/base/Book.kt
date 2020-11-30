package nl.elucidator.graphql.demo.model.base

interface Book {
    val id: Long?
    val title: String
    val author: String
    val description: String
    val reviews: List<Review>
    val comments: Comment
}

