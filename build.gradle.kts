plugins {
    java
}

tasks.withType<Jar> {
    manifest {
        attributes["Main-Class"] = "com.zippoman924.main"
    }
}