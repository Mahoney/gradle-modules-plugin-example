plugins {
    application
}

dependencies {
    compile(project(":api"))
    runtime(project(":provider"))
}

application {
    mainClassName = "$moduleName/greeter.runner.Runner"

    tasks.named<JavaExec>("run") {
        jvmArgs = listOf("-XX:+PrintGCDetails")
    }

    applicationDefaultJvmArgs = listOf("-XX:+PrintGCDetails")
}
