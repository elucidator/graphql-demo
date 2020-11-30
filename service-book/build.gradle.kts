description = "Base for Book services"

plugins {
  kotlin("jvm")
  id("kotlin")
  id("org.springframework.boot")
  id("org.jetbrains.kotlin.plugin.jpa")
}

project.dependencies {
  implementation( project(":service-model"))
}

