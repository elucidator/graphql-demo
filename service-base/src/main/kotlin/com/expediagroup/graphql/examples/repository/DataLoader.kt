package com.expediagroup.graphql.examples.repository

import com.expediagroup.graphql.examples.model.Widget
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component
import java.util.UUID

@Component
class DataLoader(val repository: WidgetRepository): ApplicationRunner {

  override fun run(args: ApplicationArguments?) {
    repository.save(Widget(0, 1, UUID.randomUUID()))
    repository.save(Widget(0, 2, UUID.randomUUID()))
    repository.save(Widget(0, 3, UUID.randomUUID()))
    repository.save(Widget(0, 4, UUID.randomUUID()))
  }
}
