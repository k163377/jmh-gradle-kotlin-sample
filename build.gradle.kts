plugins {
    kotlin("jvm") version "1.4.10"
    id("me.champeau.gradle.jmh") version "0.5.2"
}

group = "com.wrongwrong"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))

    implementation(group = "org.openjdk.jmh", name = "jmh-core", version = "1.25.2")
}
