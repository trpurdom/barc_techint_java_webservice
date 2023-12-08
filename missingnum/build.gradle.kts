plugins {
    id("java-library")
}

group = "barc.techint.java.ws.missingnum"
version = "0.1"

repositories {
    mavenCentral()
    mavenLocal()
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

dependencies {
    //Main Dependencies

    //Test Dependencies
    testImplementation(testlibs.springbootstartertest)
    testImplementation(testlibs.jupiterapi)
    testRuntimeOnly(testlibs.jupiterengine)
    testImplementation(testlibs.cucumber)
    testImplementation(testlibs.junitvintage)
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}