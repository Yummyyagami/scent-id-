plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
}

android {
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.scentid"
        minSdk = 23
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.6"
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    // Jetpack Compose
    implementation("androidx.compose.ui:ui:1.4.6")
    implementation("androidx.compose.material:material:1.4.6")
    implementation("androidx.compose.ui:ui-tooling-preview:1.4.6")
    debugImplementation("androidx.compose.ui:ui-test-manifest:1.4.6")

    // Retrofit
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")

    // Room
    implementation("androidx.room:room-runtime:2.5.1")
    kapt("androidx.room:room-compiler:2.5.1")

    // Hilt
    implementation("com.google.dagger:hilt-android:2.45")
    kapt("com.google.dagger:hilt-compiler:2.45")

    // CameraX
    implementation("androidx.camera:camera-camera2:1.2.3")
    implementation("androidx.camera:camera-lifecycle:1.2.3")
    implementation("androidx.camera:camera-view:1.2.3")

    // Coil
    implementation("io.coil-kt:coil:2.3.0")

    // Lottie
    implementation("com.airbnb.android:lottie:4.2.2")

    // Firebase
    implementation("com.google.firebase:firebase-bom:31.0.3")
    implementation("com.google.firebase:firebase-analytics-ktx")
}

kapt {
    correctErrorTypes = true
}