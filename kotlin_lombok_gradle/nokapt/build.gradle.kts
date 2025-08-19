plugins {
    java
    kotlin("jvm")

    id("org.jetbrains.kotlin.plugin.lombok") version "2.2.0"
}

dependencies {
    compileOnly("org.projectlombok:lombok:1.18.38")
    annotationProcessor("org.projectlombok:lombok:1.18.38")
}

// Tasks to run main functions in Java and Kotlin usages
tasks.register<JavaExec>("runJavaUsage") {
    group = "application"
    description = "Runs the Java main: examples.nokapt.JavaUsage"
    mainClass.set("examples.nokapt.JavaUsage")
    classpath = sourceSets.main.get().runtimeClasspath
}

tasks.register<JavaExec>("runKotlinUsage") {
    group = "application"
    description = "Runs the Kotlin main: examples.nokapt.KotlinUsageKt"
    mainClass.set("examples.nokapt.KotlinUsageKt")
    classpath = sourceSets.main.get().runtimeClasspath
}
