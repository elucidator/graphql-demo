package nl.elucidator.graphql.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@SpringBootApplication
open class DemoApplication

fun main(args: Array<String>) {
	runApplication<DemoApplication>(*args)
}
