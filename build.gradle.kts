// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
}
extra["kotlin_version"] = "1.8.0"
extra["compileSdk"] = 34
extra["minSdk"] = 29
extra["targetSdk"] = 34