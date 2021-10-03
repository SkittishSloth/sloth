plugins {
    // Apply the org.jetbrains.kotlin.jvm Plugin to add support for Kotlin.
    id("org.jetbrains.kotlin.jvm")
    id("sloth.versions-plugin")
    id("info.solidsoft.pitest")
    id("com.diffplug.spotless")
}

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}

dependencies {
    val kotestVersion = "4.5.0"
    val kotestPitestVersion = "1.0.1"
    val kotlinLoggingVersion = "1.7.9"
    val logbackClassicVersion = "1.2.3"
    val koinVersion = "2.1.6"
    val arrowVersion = "1.0.0"
    
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    // Align versions of all Kotlin components
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))

    // Use the Kotlin JDK 8 standard library.
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    // Align versions of all Kotlin components
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))

    implementation("io.github.microutils:kotlin-logging:${kotlinLoggingVersion}")
    implementation("ch.qos.logback:logback-classic:${logbackClassicVersion}")

    implementation(platform("io.arrow-kt:arrow-stack:${arrowVersion}"))
    implementation("io.arrow-kt:arrow-core")
    implementation("io.arrow-kt:arrow-fx-coroutines")

    testImplementation("io.kotest:kotest-assertions-core:${kotestVersion}")
    testImplementation("io.kotest:kotest-runner-junit5:${kotestVersion}")
    testImplementation("io.kotest.extensions:kotest-extensions-pitest:${kotestPitestVersion}")

    testImplementation("io.insert-koin:koin-test:${koinVersion}")
}

tasks.test {
    // Use JUnit Platform for unit tests.
    useJUnitPlatform()
}
