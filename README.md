# Kotlin Lombok Compiler Plugin Examples

This repository demonstrates various approaches to using the Kotlin Lombok compiler plugin in different build systems and configurations. The examples showcase interoperability between Java Lombok-annotated classes and Kotlin code.

## Examples

### [Gradle Examples](kotlin_lombok_gradle/)
Multi-module Gradle project demonstrating three different Lombok configurations:
- **[nokapt](kotlin_lombok_gradle/nokapt/)** - Basic Lombok without KAPT (suitable if you don't need KAPT)
- **[yeskapt](kotlin_lombok_gradle/yeskapt/)** - Lombok with KAPT for better Kotlin integration and multiple annotation processors
- **[withconfig](kotlin_lombok_gradle/withconfig/)** - Lombok with custom configuration via `lombok.config` file

### [Maven Examples](kotlin_lombok_maven/)
Multi-module Maven project showing two approaches:
- **[nokapt](kotlin_lombok_maven/nokapt/)** - Lombok usage without KAPT for simpler configuration
- **[yeskapt](kotlin_lombok_maven/yeskapt/)** - Lombok with KAPT for multiple annotation processors

## Getting Started

Choose the example that best matches your build system and requirements:
- Use **Gradle** examples if you're using Gradle build system
- Use **Maven** examples if you're using Maven build system
- Use **nokapt** variants for basic Lombok functionality
- Use **yeskapt** variants when you need additional annotation processors alongside Lombok

For detailed setup and usage instructions, see the README files in each example directory. 