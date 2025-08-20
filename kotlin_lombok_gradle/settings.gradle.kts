pluginManagement {
    repositories {
        gradlePluginPortal()
    }
}


rootProject.name = "kotlin_lombok_gradle"

include("nokapt")
include("yeskapt")
include("withconfig")

