// Where Gradle should look for plugins, how they should be resolved,
// and any configurations related to plugin usage.
pluginManagement {
    // The repositories where Gradle should search for plugins.
    repositories {
        // pull in a specific subset of dependencies from the Google Maven repository.
        // By filtering groups this way, you can avoid unnecessary dependencies being
        // fetched, which can improve build times and reduce potential version conflicts
        google {
            mavenContent() {
                includeGroupByRegex(".*android.*")
                includeGroupByRegex(".*google.*")
            }
        }
        // Use the Maven Central repository as a source for finding and downloading plugins.
        mavenCentral()
    }
}

// Configure how dependencies are resolved across all projects in a multi-project build
dependencyResolutionManagement {
    repositories {
        google {
            mavenContent() {
                includeGroupByRegex(".*android.*")
                includeGroupByRegex(".*google.*")
            }
        }
        mavenCentral()
    }
}

// Include the project in the root project
include(":app")