plugins {
    alias(libs.plugins.android.app)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.android.quicksearchbox"
    defaultConfig {
        applicationId = "com.android.quicksearchbox"
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        compileOptions {
            sourceCompatibility = JavaVersion.VERSION_11
            targetCompatibility = JavaVersion.VERSION_11
        }

    }
}

dependencies {
    implementation(project(":common"))
    implementation(libs.androidx.core)
    implementation(libs.kotlinx.coroutines.android)
    implementation(libs.guava)
}
