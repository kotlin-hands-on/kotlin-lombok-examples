# Kotlin Lombok Maven Examples

This project demonstrates how to use Lombok with Kotlin in Maven-based projects, showcasing two different approaches: with and without KAPT (Kotlin Annotation Processing Tool).

## Project Structure

The project is organized as a multi-module Maven project with two main modules:

- **`nokapt/`** - Demonstrates Lombok usage with Kotlin without KAPT
- **`yeskapt/`** - Demonstrates Lombok usage with Kotlin using KAPT for additional annotation processing


### When to Use Each Approach

- **Use `nokapt`** when you only need Lombok functionality and want simpler configuration
- **Use `yeskapt`** when you need multiple annotation processors (like Moshi, Room, etc.) alongside Lombok


## Building the Project

### Prerequisites

- Java 8 or higher
- Maven 3.6 or higher

### Build Commands

```bash
# Build all modules
mvn clean compile

# Build specific module
mvn -pl nokapt clean compile
mvn -pl yeskapt clean compile

# Run tests
mvn test
```

## Key Configuration Details

### Lombok Configuration

The `nokapt` module includes a `lombok.config` file with:
- `config.stopBubbling = true` - Prevents configuration inheritance
- `lombok.getter.noIsPrefix = true` - Removes "is" prefix from boolean getters

### Maven Plugin Configuration

Both modules use the `kotlin-maven-plugin` with the lombok compiler plugin:

```xml
<compilerPlugins>
    <plugin>lombok</plugin>
</compilerPlugins>
```

The `yeskapt` module additionally configures KAPT for multiple annotation processors.


## Example Usage

### Java Classes with Lombok

```java
@Getter @Setter @ToString
public class SomePojo {
    @NonNull
    private String name;
    private int age;
    private boolean human;
}

@Data
public class SomeData {
    private String name;
    private int age;
    private boolean human;
}
```

### Kotlin Usage

```kotlin
fun main() {
    val obj = SomePojo()
    obj.name = "test"
    obj.age = 12
    obj.human = true
    println(obj)
    
    val data = SomeData()
    data.age = 25
    println(data)
}
```
