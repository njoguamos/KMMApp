plugins {
    kotlin("multiplatform")
    kotlin("plugin.compose")
    id("com.android.application")
    id("org.jetbrains.compose")
}

// Use plugins in our scripts
kotlin {
    jvm() // As desktop target
    androidTarget() // Supports Android

    iosX64() // Supports iOS (simulator)
    iosArm64() // Supports iOS (device)
    iosSimulatorArm64() // Supports iOS (simulator)

    // Dependencies that are shared between all targets
    sourceSets.commonMain.dependencies {
        // core building blocks for Jetpack Compose
        implementation(compose.runtime)
        //  foundational UI components like layouts, text, and drawing utilities for building the interface.
        implementation(compose.foundation)
        // Includes Material Design 3 components, including buttons, shapes, and typography.
        implementation(compose.material3)
    }
}

android {
    namespace = "org.example.kmmapp"
    compileSdk = 30
}