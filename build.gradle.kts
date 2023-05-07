import org.jetbrains.dokka.gradle.DokkaTaskPartial

plugins {
  id("org.jetbrains.dokka") version "1.8.10"
}

allprojects {
  group = "dev.ktransform"
  version = rootProject.properties["version"] as String

  repositories {
    mavenCentral()
    google()
  }

}

subprojects {
  // === Plugins ===
  apply(plugin = "org.jetbrains.dokka")


  // === Plugin Configuration ===
  tasks.withType<DokkaTaskPartial>().configureEach {
    dokkaSourceSets.configureEach{
      includes.from(
        "README.md",
        // Add more project-based document here if needed...
      )
    }
  }


}