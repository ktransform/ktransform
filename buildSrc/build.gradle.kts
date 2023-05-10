/*
PLEASE NOTE!
buildSrc is a special module that pre-configures the build environment for the rest of the project.
It means this module compiles first, even before the root project.
If you try any actions that require the root project to be compiled, you will get an error.

Take a look at the following links for more information:
https://docs.gradle.org/current/userguide/organizing_gradle_projects.html#sec:build_sources
**/
plugins {
  `kotlin-dsl`
}

repositories {
  mavenCentral()
  google()
}


dependencies {
  implementation(kotlin("gradle-plugin", "1.8.10"))
}