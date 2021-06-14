plugins {
    java
    kotlin("jvm") version "1.5.20-RC"
}

group = "org.example"
version = "1.0-SNAPSHOT"

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("junit", "junit", "4.12")
}

allprojects {
    repositories {
        mavenCentral()
        mavenLocal()
        maven {
            url = uri("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/dev")
        }
    }
}
