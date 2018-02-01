import sbt.Keys.libraryDependencies

lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.0.3"

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.neulab",
      scalaVersion := "2.12.3",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "utils",
    libraryDependencies += scalaTest % Test,
    libraryDependencies += "org.scalaz" %% "scalaz-core" % "7.2.18",
    libraryDependencies += "com.chuusai" %% "shapeless" % "2.3.3"


)