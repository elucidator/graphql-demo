rootProject.name = "Elucidator GrahpQL Demo"
include("service-book")
include("service-base")
include("service-extension")



pluginManagement {

  plugins {
    kotlin("jvm") version "1.3.72"
    kotlin("plugin.spring") version "1.3.72"
    id("org.springframework.boot") version "2.3.4.RELEASE"
    id("org.springframework.boot") version "2.3.4.RELEASE"
    id("org.jetbrains.kotlin.plugin.jpa") version "1.3.72"
    id("io.spring.dependency-management") version "1.0.10.RELEASE"
  }

}
