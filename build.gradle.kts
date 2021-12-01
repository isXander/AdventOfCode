plugins {
    kotlin("jvm") version "1.6.0" apply false
}

subprojects {
    apply(plugin = "org.jetbrains.kotlin.jvm")

    group = "dev.isxander"
    version = "1.0"

    repositories {
        mavenCentral()
    }

    val implementation by configurations

    dependencies {
        implementation(kotlin("stdlib"))
    }
}