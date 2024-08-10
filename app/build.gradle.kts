plugins {
    kotlin("multiplatform")
    kotlin("plugin.compose")
    id("com.android.application")
    id("org.jetbrains.compose")
}

// Use plugins in our scripts
kotlin {
    jvmToolchain(17) // Use Java 17
    androidTarget() // Supports Android
    jvm() // As desktop target

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

    // Android-specific dependencies
    sourceSets.androidMain.dependencies {
        // Integrates Jetpack Compose with Android activities,
        implementation("androidx.activity:activity-compose:1.9.1")
        // Provides backward-compatible support for modern Android features,
        // allowing your app to run on older Android versions while using
        // newer UI components.
        implementation("androidx.appcompat:appcompat:1.7.0")
    }
}

android {
    namespace = "com.example.kmmapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.kmmapp"
        minSdk = 29
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }
}