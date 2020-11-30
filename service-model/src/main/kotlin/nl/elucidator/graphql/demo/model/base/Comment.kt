package nl.elucidator.graphql.demo.model.base

interface Comment {
  val id: Long?
  val type: String
  val location: Location
}


