package nl.elucidator.graphql.demo


import nl.elucidator.graphql.demo.model.BookImpl
import nl.elucidator.graphql.demo.model.CommentImpl
import nl.elucidator.graphql.demo.model.DefaultLocation
import nl.elucidator.graphql.demo.model.ReviewImpl
import org.hibernate.boot.MetadataSources
import org.hibernate.boot.registry.StandardServiceRegistryBuilder
import org.hibernate.cfg.Environment
import org.hibernate.tool.hbm2ddl.SchemaExport
import org.hibernate.tool.schema.TargetType
import org.springframework.stereotype.Component
import java.util.EnumSet
import java.util.HashMap
import javax.annotation.PostConstruct


@Component
class SchemaGenerator {

  @PostConstruct
  fun postConstruct() {
    val settings: MutableMap<String?, String?> = HashMap()
    settings[Environment.URL] = "jdbc:h2:mem:schema"

    val serviceRegistry = StandardServiceRegistryBuilder().applySettings(settings).build()

    val metadataSources = MetadataSources(serviceRegistry)
    metadataSources.addAnnotatedClass(BookImpl::class.java)
    metadataSources.addAnnotatedClass(CommentImpl::class.java)
    metadataSources.addAnnotatedClass(DefaultLocation::class.java)
    metadataSources.addAnnotatedClass(ReviewImpl::class.java)
//    metadataSources.addAnnotatedClass(AccountSetting::class.java)
    val metadata = metadataSources.buildMetadata()

    val schemaExport = SchemaExport()
    schemaExport.setFormat(true)
    schemaExport.setOutputFile("create.sql")
    schemaExport.createOnly(EnumSet.of(TargetType.SCRIPT), metadata)
  }
}
