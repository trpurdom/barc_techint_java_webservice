rootProject.name = "barc-techint-javaws"

include("missingnum")

dependencyResolutionManagement {
    pluginManagement {
        repositories {
            mavenLocal()
            mavenCentral()
        }
    }

    versionCatalogs {
        create("libs") {
            library("springbootweb", "org.springframework.boot:spring-boot-starter-web:3.0.6")
            library("springbootannoproc", "org.springframework.boot:spring-boot-configuration-processor:3.0.6")
            library("slf4j", "org.slf4j:slf4j-api:2.0.7")
        }
        create("testlibs") {
            library("jupiterapi", "org.junit.jupiter:junit-jupiter-api:5.8.1")
            library("jupiterengine", "org.junit.jupiter:junit-jupiter-engine:5.8.1")
            library("springbootstartertest", "org.springframework.boot:spring-boot-starter-test:3.0.6")
            library("cucumber", "io.cucumber:cucumber-java:7.14.0")
            library("junitvintage", "org.junit.vintage:junit-vintage-engine:5.9.3")
        }
    }
}

