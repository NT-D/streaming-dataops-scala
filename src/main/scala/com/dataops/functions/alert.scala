package com.dataops.functions

// In general, scala uses UpperCamelCase and lowerCamelCase
// https://docs.scala-lang.org/style/naming-conventions.html
// But, Spark functions name convention is snake, so I ues snake in this sample
// https://spark.apache.org/docs/latest/api/scala/org/apache/spark/sql/functions$.html
object alert {
  def detect_overheat():Boolean = {
    // Will implement alert logic in next PR
    true
  }
}