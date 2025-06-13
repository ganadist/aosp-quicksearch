plugins {
    alias(libs.plugins.android.lib)
}

android {
    namespace = "com.android.common"
    defaultConfig {
        compileOptions {
            sourceCompatibility = JavaVersion.VERSION_11
            targetCompatibility = JavaVersion.VERSION_11
        }
    }
}
