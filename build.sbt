name := """testapp"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
	  javaJdbc,
	  javaEbean,
	  cache,
	  javaWs
)

libraryDependencies += "org.xerial" % "sqlite-jdbc" % "3.7.2"

