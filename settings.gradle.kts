pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
    }

    val androidGradlePluginVersion: String by settings
    plugins {
        id("com.android.settings") version androidGradlePluginVersion
    }
}

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            val androidGradlePluginVersion: String by settings
            version("android-gradle", androidGradlePluginVersion)
        }
    }

    repositories {
        google()
        mavenCentral()
    }
}

plugins {
    id("com.android.settings")
}

android {
    minSdk = 29
    compileSdk = 36
}

rootProject.name = "aosp-quicksearch"
include(":app")
include(":common")
