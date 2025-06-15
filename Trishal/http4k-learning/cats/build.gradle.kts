plugins {
    kotlin("jvm") version "2.1.20"
}

repositories {
    mavenCentral()
}

dependencies {
    // install the platform...
    implementation(platform("org.http4k:http4k-bom:6.12.0.0"))
    // ...then choose any moduless but at least the core
    implementation("org.http4k:http4k-core")
    // Moshi:
    implementation("org.http4k:http4k-format-moshi")
    implementation("org.http4k:http4k-server-jetty")


    testImplementation("org.http4k:http4k-testing-kotest")
    testImplementation("org.http4k:http4k-testing-approval")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}