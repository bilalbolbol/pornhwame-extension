plugins {
    kotlin("jvm") version "1.7.10"
}

version = 1
cloudflareBypass = true

repositories {
    mavenCentral()
    maven("https://raw.githubusercontent.com/Jays2Kings/tachiyomi-lib/master")
}

dependencies {
    implementation("eu.kanade.tachiyomi:source-api:1.0")
}
