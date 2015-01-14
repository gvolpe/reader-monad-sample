name := """reader-monad-sample"""

version := "1.0"

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.1.6" % "test",
  "org.specs2" %% "specs2-core" % "2.4.15" % "test",
  "org.scalaz" %% "scalaz-core" % "7.1.0"
)