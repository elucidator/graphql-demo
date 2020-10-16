package com.expediagroup.graphql.examples.repository

import com.expediagroup.graphql.examples.extend.book.OrderInformation
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component

@Component
class DataLoader(val repository: OrderInformationRepository): ApplicationRunner {

  override fun run(args: ApplicationArguments?) {
    repository.save(OrderInformation(null, 1, "1234-567-789", "Packet", 125, 2))
    repository.save(OrderInformation(null, 1, "1234-567-789", "Op de Hoek", 521, 1))
    repository.save(OrderInformation(null, 2, "9876-543-321", "Packet", 234, 2))
    repository.save(OrderInformation(null, 2, "9876-543-321", "Packet", 456, 19))
  }
}
