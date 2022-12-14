plugins {
    id("com.gradle.enterprise") version "3.11.1"
}

rootProject.name = "devops-practice"

val destination = File(".git/hooks/commit-msg")
File("check-commit.sh")
    .copyTo(destination, overwrite = true)
destination.setExecutable(true)