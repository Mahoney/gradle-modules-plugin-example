plugins {
    application
}

dependencies {
    compile(project(":greeter.api"))
    runtime(project(":greeter.provider"))
}

application {
    mainClassName = "$moduleName/greeter.runner.Runner"

    tasks.named<JavaExec>("run") {
        jvmArgs = listOf("-XX:+PrintGCDetails")
    }

    applicationDefaultJvmArgs = listOf("-XX:+PrintGCDetails")
}
