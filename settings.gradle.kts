// Where Gradle should look for plugins, how they should be resolved,
// and any configurations related to plugin usage.
pluginManagement {
    // The repositories where Gradle should search for plugins.
    repositories {
        // Use the Maven Central repository as a source for finding and downloading plugins.
        mavenCentral()
        // Also use the Gradle Plugin Portal
        // gradlePluginPortal()
    }
}

// Configure how dependencies are resolved across all projects in a multi-project build
dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
}

// Include the project in the root project
include(":app")