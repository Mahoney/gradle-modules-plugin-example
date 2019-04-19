import org.gradle.api.JavaVersion.VERSION_11
import org.javamodularity.moduleplugin.ModuleSystemPlugin

plugins {
    java
    id("org.javamodularity.moduleplugin") version "1.5.0" apply false
}

subprojects {
    apply<JavaPlugin>()
    apply<ModuleSystemPlugin>()

    version = "1.0.0"

    java {
        sourceCompatibility = VERSION_11
        targetCompatibility = VERSION_11
    }

    repositories {
        mavenCentral()
    }

    val test by tasks.getting(Test::class) {
        useJUnitPlatform()

        testLogging {
            events("PASSED", "FAILED", "SKIPPED")
        }
    }

    dependencies {
        testCompile("org.junit.jupiter:junit-jupiter-api:5.2.0")
        testCompile("org.junit.jupiter:junit-jupiter-params:5.2.0")
        testRuntime("org.junit.jupiter:junit-jupiter-engine:5.2.0")
    }
}
