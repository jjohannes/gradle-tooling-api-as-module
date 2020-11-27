plugins {
    application
    id("de.jjohannes.extra-java-module-info") version "0.3"
}

repositories {
    mavenCentral()
    maven { url = uri("https://repo.gradle.org/gradle/libs-releases") }
}

java {
    modularity.inferModulePath.set(true)
}

extraJavaModuleInfo {
    module("gradle-tooling-api-6.8-rc-1.jar", "org.gradle.tooling", "6.8-rc-1") {
        requires("org.slf4j")
        exports("org.gradle.tooling")
        exports("org.gradle.tooling.model")
    }
}

dependencies {
    implementation("org.gradle:gradle-tooling-api:6.8-rc-1")
}

application {
    mainClass.set("tapi.as.module.App")
    mainModule.set("tapi.as.module.app")
}
