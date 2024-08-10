plugins {
    // declare the plugins and its version without
    // immediately applying it, giving you flexibility to apply it
    // where needed in a multi-project Gradle setup.
    kotlin("multiplatform") version "2.0.0" apply false
    kotlin("plugin.compose") version "2.0.0" apply false
    id("org.jetbrains.compose") version "1.6.11" apply false
    id("com.android.application") version "8.5.2" apply false
}