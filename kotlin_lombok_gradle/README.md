# Kotlin Lombok Examples with Gradle

This project demonstrates different approaches to using Lombok with Kotlin in a Gradle multi-module setup. It showcases
various configuration strategies and their effects on interoperability between Java and Kotlin code. 

The Kotlin Lombok compiler plugin is used: https://kotlinlang.org/docs/lombok.html

## Configuration Details

### KAPT Configuration

```kotlin
kapt {
    keepJavacAnnotationProcessors = true
}
```

### Kotlin Lombok Plugin Configuration

```kotlin
kotlinLombok {
    lombokConfigurationFile(file("lombok.config"))
}
```

### Custom Lombok Configuration (withconfig/lombok.config)

```
config.stopBubbling = true
lombok.getter.noisPrefix = true
```

## Project Structure

### 1. `nokapt` - Basic Lombok without KAPT (suitable if you don't need KAPT)

- **Purpose**: Demonstrates basic Lombok usage without Kotlin Annotation Processing Tool (KAPT)
- **Configuration**: Uses only `kotlin.plugin.lombok` and standard `annotationProcessor`
- **Features**: Basic `@Getter`, `@Setter`, `@ToString` annotations
- **Limitations**: Limited Kotlin interoperability

### 2. `yeskapt` - Lombok with KAPT and Full Configuration (If you need KAPT)

- **Purpose**: Shows comprehensive Lombok setup with KAPT for better Kotlin integration
- **Configuration**: Includes KAPT, KSP, Dagger, and Moshi processors
- **Features**:
    - `@NonNull` annotations with null-safety integration
    - Multiple annotation processors (Dagger, Moshi)
    - Enhanced Kotlin-Java interoperability
- **Known Issue**: NPE when accessing `@NonNull` fields initialized as null from Kotlin

### 3. `withconfig` - Lombok with Custom Configuration

- **Purpose**: Demonstrates Lombok with custom configuration via `lombok.config`
- **Configuration**: Uses `lombok.config` file to customize Lombok behavior
- **Features**:
    - Custom Lombok settings (`lombok.getter.noisPrefix = true`)
    - `@NonNull` annotations
    - Custom configuration inheritance blocking

## Dependencies and Tools Used

- **Kotlin**: 2.2.0
- **Lombok**: 1.18.38 (via io.freefair.lombok plugin 8.14.2)
- **KAPT**: Kotlin Annotation Processing Tool
- **KSP**: Kotlin Symbol Processing (2.2.0-2.0.2)
- **Dagger**: 2.57 (for dependency injection examples)
- **Moshi**: 1.15.2 (for JSON serialization examples)

## Running the Examples

### Prerequisites

- Java 11 or higher
- Gradle (wrapper included)

### Build All Modules

```bash
./gradlew build
```

### Run Individual Examples

#### nokapt Module

```bash
# Run Java example
./gradlew nokapt:runJavaUsage

# Run Kotlin example  
./gradlew nokapt:runKotlinUsage
```

#### yeskapt Module

```bash
# Run Java example
./gradlew yeskapt:runJavaUsage

# Run Kotlin example
./gradlew yeskapt:runKotlinUsage
```

#### withconfig Module

```bash
# Run Java example
./gradlew withconfig:runJavaUsage

# Run Kotlin example
./gradlew withconfig:runKotlinUsage
```
