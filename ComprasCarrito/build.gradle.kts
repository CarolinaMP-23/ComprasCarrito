plugins {
    id("java")
}

group = "org.carolinam"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven {
        url = uri("https://repo.serenity-bdd.info/content/repositories/releases")
        url = uri("https://repo.spring.io/release")
        url = uri("https://repo.apache.org/maven2")
        url = uri ("https://cucumber.io/blog/open-source/announcing-cucumber-jvm-4-2-0/")
    }
}

dependencies {

    testImplementation ("net.serenity:serenity.core:2.3.10")
    testImplementation ("net.serenity:serenity-cucumber4:1.0.4")
    implementation ("net.serenity:serenity.screenplay:2.3.10")
    implementation ("io.cucumber:cucumber-java:6.10.4")
    implementation ("io.cucumber:cucumber-junit:6.10.4")
    implementation ("org.reflect-simple:1.8.20")
    testImplementation ("io.cucumber:cucumber-junit:6.10.4")
}

tasks.test {
    useJUnitPlatform()
}