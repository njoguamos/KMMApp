plugins {
    kotlin("multiplatform")
    id("com.android.application")
}

// Use plugins in our scripts
kotlin {
    jvm() // As desktop target
    androidTarget() // Supports Android

    iosX64() // Supports iOS (simulator)
    iosArm64() // Supports iOS (device)
    iosSimulatorArm64() // Supports iOS (simulator)
}

android {
    namespace = "org.example.kmmapp"
    compileSdk = 30
}