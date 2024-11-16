plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)


    id("kotlin-kapt")
    id("kotlin-parcelize")
    kotlin("plugin.serialization") version "2.0.20"
    alias(libs.plugins.compose.compiler)


}

android {
    namespace = "io.github.junrdev.recycle"
    compileSdk = 34

    defaultConfig {
        applicationId = "io.github.junrdev.recycle"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    //compose
    val composeBom = platform("androidx.compose:compose-bom:2024.10.01")
    implementation(composeBom)
    testImplementation(composeBom)
    androidTestImplementation(composeBom)

    testImplementation(libs.androidx.ui.test.junit4)
    androidTestImplementation(libs.androidx.ui.test)




}