plugins {
    java
    kotlin("jvm")
    kotlin("kapt")

    id("io.freefair.lombok") version "5.3.0"
    id("org.jetbrains.kotlin.plugin.lombok") version "1.5.20-RC"
}

kapt {
    keepJavacAnnotationProcessors = true
}

kotlinLombok {
    lombokConfigurationFile(file("lombok.config"))
}

dependencies {
    implementation("com.squareup.moshi:moshi-kotlin:1.12.0")
    kapt("com.squareup.moshi:moshi-kotlin-codegen:1.12.0")
    kapt("com.google.dagger:dagger-compiler:2.33")
}
