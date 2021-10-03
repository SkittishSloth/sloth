plugins {
    // Support convention plugins written in Kotlin. Convention plugins are build scripts in 'src/main' that automatically become available as plugins in the main build.
    `kotlin-dsl`
}

repositories {
    // Use the plugin portal to apply community plugins in convention plugins.
    gradlePluginPortal()
    mavenCentral()
}

dependencies {
    val versionsPluginVersion = "0.39.0"
    val detektVersion = "1.18.1"
    val spotlessVersion = "5.16.0"
    val pitestPluginVersion = "1.7.0"

    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin")
    implementation("com.github.ben-manes:gradle-versions-plugin:${versionsPluginVersion}")
    implementation("io.gitlab.arturbosch.detekt:detekt-gradle-plugin:${detektVersion}")
    implementation("com.diffplug.spotless:spotless-plugin-gradle:${spotlessVersion}")
    implementation("info.solidsoft.gradle.pitest:gradle-pitest-plugin:${pitestPluginVersion}")
}
