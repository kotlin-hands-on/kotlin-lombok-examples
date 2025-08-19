pluginManagement {
    repositories {
        mavenLocal()
        gradlePluginPortal()
        maven {
            url = uri("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/dev")
        }
    }
}


rootProject.name = "kotlin_lombok_gradle"

include("nokapt")
include("yeskapt")
include("withconfig")

