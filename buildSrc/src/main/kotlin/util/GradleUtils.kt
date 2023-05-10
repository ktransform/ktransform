package util

import org.gradle.api.Project

fun <T> Project.getProperty(key: String): T {
  val property = this.properties[key]
  return try {
    @Suppress("UNCHECKED_CAST")
    property as T
  }catch (e: ClassCastException) {
    throw ClassCastException("Property $key is not the type you expected: ${property}")
  }
}