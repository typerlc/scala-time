organization := "org.scalaj"

name := "scalaj-time"

version := "0.7-SNAPSHOT"

publishMavenStyle := true

scalaVersion := "2.10.0"

scalacOptions <++= scalaVersion map { v =>
  if (v.startsWith("2.10"))
    Seq("-unchecked", "-deprecation", "-feature", "-language:implicitConversions")
  else
    Seq("-unchecked", "-deprecation")
}

libraryDependencies ++= Seq(
  "joda-time" % "joda-time" % "2.1",
  "org.joda" % "joda-convert" % "1.2" % "compile"
)
