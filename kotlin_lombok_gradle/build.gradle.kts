plugins {
    java
    kotlin("jvm") version "2.2.0"
}

allprojects {
    repositories {
        mavenCentral()
    }
}


group = "org.example"
version = "1.0-SNAPSHOT"

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("junit", "junit", "4.12")
}
