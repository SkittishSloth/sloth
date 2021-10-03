plugins {
    // Apply the common convention plugin for shared build configuration between library and application projects.
    id("sloth.kotlin-common-conventions")

    // Apply the application plugin to add support for building a CLI application in Java.
    application
}

dependencies {
    val cliktVersion = "3.2.0"
    val mordantVersion = "2.0.0-beta2"
    val directoriesVersion = "11"

    implementation("com.github.ajalt.clikt:clikt:${cliktVersion}")
    implementation("com.github.ajalt.mordant:mordant:${mordantVersion}")
    implementation("io.github.soc:directories:${directoriesVersion}")
}