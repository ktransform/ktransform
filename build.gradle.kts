import org.jetbrains.dokka.gradle.DokkaTaskPartial
import util.getProperty

plugins {
  id("org.jetbrains.dokka") version "1.8.10"
}

allprojects {
  group = "dev.ktransform"
  version = project.getProperty("version")

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