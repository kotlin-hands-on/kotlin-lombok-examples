plugins {
    java
    application
    kotlin("jvm")
    kotlin("kapt")

    id("io.freefair.lombok") version "8.14.2"
    id("org.jetbrains.kotlin.plugin.lombok") version "2.2.0"
    id("com.google.devtools.ksp").version("2.2.0-2.0.2")
}

kapt {
    keepJavacAnnotationProcessors = true
}

kotlinLombok {
    lombokConfigurationFile(file("lombok.config"))
}

dependencies {
    ksp("com.squareup.moshi:moshi-kotlin-codegen:1.15.2")
    kapt("com.google.dagger:dagger-compiler:2.57")
    implementation("com.squareup.moshi:moshi-kotlin:1.15.2")
}

// Tasks to run main functions in Java and Kotlin usages
tasks.register<JavaExec>("runJavaUsage") {
    group = "application"
    description = "Runs the Java main: examples.withconfig.JavaUsage"
    mainClass.set("examples.withconfig.JavaUsage")
    classpath = sourceSets.main.get().runtimeClasspath
}

tasks.register<JavaExec>("runKotlinUsage") {
    group = "application"
    description = "Runs the Kotlin main: examples.withconfig.KotlinUsageKt"
    mainClass.set("examples.withconfig.KotlinUsageKt")
    classpath = sourceSets.main.get().runtimeClasspath
}
