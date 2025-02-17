plugins {
    id("calcar.android.application")
    id("calcar.android.application.compose")
    id("calcar.android.koin")
}

android {
    namespace = "com.calcar"

    defaultConfig {
        applicationId = "com.calcar"
        versionCode = 1
        versionName = "0.0.1"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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

    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation(project(":common:ui"))
    implementation(project(":dependencies"))
    implementation(project(":feature:onboarding"))

    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.core.ktx)
}