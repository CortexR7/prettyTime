/*
 * Java library build configuration.
 */

plugins {
    `java-library`
    id("com.vanniktech.maven.publish") version "0.37.0"
}

group = "io.github.cortexr7"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(libs.junit.jupiter)
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")

    // Exposed to consumers' compile classpaths.
    api(libs.commons.math3)

    // Internal implementation dependency.
    implementation(libs.guava)
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}

mavenPublishing {
    publishToMavenCentral()
    signAllPublications()

    coordinates("io.github.cortexr7", "pretty-time", "1.0.1")

    pom {
        name.set("Pretty Time")
        description.set("A library that makes timing easier")
        inceptionYear.set("2026")
        url.set("https://github.com/CortexR7/prettyTime")
        licenses {
            license {
                name.set("MIT License")
                url.set("https://opensource.org/license/mit")
                distribution.set("repo")
            }
        }
        developers {
            developer {
                id.set("CortexR7")
                name.set("CortexR7")
                url.set("https://github.com/CortexR7/")
            }
        }
        scm {
            url.set("https://github.com/CortexR7/prettyTime")
            connection.set("scm:git:git://github.com/CortexR7/prettyTime.git")
            developerConnection.set("scm:git:ssh://git@github.com/CortexR7/prettyTime.git")
        }
    }
}