import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
  id("io.spring.dependency-management")
  kotlin("jvm")
  kotlin("plugin.spring")
}

group = "nl.elucidator.graphql"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

configurations {
  compileOnly {
    extendsFrom(configurations.annotationProcessor.get())
  }
}

allprojects {
  buildscript {
    repositories {
      mavenLocal()
      jcenter()
      mavenCentral()
    }
  }

  repositories {
    mavenLocal()
    jcenter()
    mavenCentral()
  }


}

subprojects {

  extra["testcontainersVersion"] = "1.14.3"

  println("Enabling kotlin plugin in ${project.name}")
  apply(plugin = "kotlin")
  println("Enabling Dependency plugin in ${project.name}")
  apply(plugin = "io.spring.dependency-management")

  dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib")

    implementation("com.expediagroup:graphql-kotlin-spring-server:4.0.0-alpha.4")

    implementation("org.springframework.boot:spring-boot-starter-actuator")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    testImplementation(kotlin("test-junit5", "1.3.72"))
    implementation("com.h2database:h2")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    testImplementation("org.springframework.boot:spring-boot-starter-test") {
      exclude(group = "org.junit.vintage", module = "junit-vintage-engine")
    }
    testImplementation("org.testcontainers:junit-jupiter")
  }

  dependencyManagement {
    imports {
      mavenBom("org.testcontainers:testcontainers-bom:${property("testcontainersVersion")}")
    }
  }

  println("Setting kotlin compile in ${project.name}")
  tasks.withType<KotlinCompile> {
    kotlinOptions {
      freeCompilerArgs = listOf("-Xjsr305=strict")
      jvmTarget = "11"
    }
  }

}


