plugins {
    java
    kotlin("jvm")

    id("org.jetbrains.kotlin.plugin.lombok") version "1.5.20-RC"
}

dependencies {
    compileOnly("org.projectlombok:lombok:1.18.20")
    annotationProcessor("org.projectlombok:lombok:1.18.20")
}
