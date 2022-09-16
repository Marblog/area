import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.springframework.boot") version "2.3.12.RELEASE"
    id("io.spring.dependency-management") version "1.0.12.RELEASE"
    kotlin("jvm") version "1.6.21"
    kotlin("plugin.spring") version "1.6.21"
}

group = "cn.marblog"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

repositories {
    mavenCentral()
    maven("https://maven.aliyun.com/repository/public/")
}

dependencyManagement {
    dependencies {
        dependency("org.springframework.cloud:spring-cloud-dependencies:Hoxton.SR12")
        dependency("com.alibaba.cloud:spring-cloud-starter-alibaba-nacos-config:2.2.7.RELEASE")
        dependency("com.alibaba.cloud:spring-cloud-starter-alibaba-nacos-discovery:2.2.7.RELEASE")
        dependency("com.alibaba.cloud:spring-cloud-alibaba-dependencies:2.2.7.RELEASE")
    }
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")

    implementation("org.springframework.boot:spring-boot-starter-actuator")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("com.baomidou:mybatis-plus-boot-starter:3.5.2")
    implementation("com.baomidou:mybatis-plus-generator:3.5.3")
    implementation("org.freemarker:freemarker:2.3.31")
    implementation("org.springdoc:springdoc-openapi-ui:1.6.11")

    implementation("org.springframework.cloud:spring-cloud-dependencies:Hoxton.SR12")
    implementation("com.alibaba.cloud:spring-cloud-starter-alibaba-nacos-config:2.2.7.RELEASE")
    implementation("com.alibaba.cloud:spring-cloud-starter-alibaba-nacos-discovery:2.2.7.RELEASE")
    implementation("com.alibaba.cloud:spring-cloud-alibaba-dependencies:2.2.7.RELEASE")


    developmentOnly("org.springframework.boot:spring-boot-devtools")
    runtimeOnly("mysql:mysql-connector-java")
    annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "11"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}
