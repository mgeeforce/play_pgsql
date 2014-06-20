name := """play_pgsql"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,
  "org.postgresql" % "postgresql" % "9.3-1101-jdbc41",
  "org.webjars" % "bootstrap" % "3.1.1-1",
  "org.webjars" % "jquery" % "2.1.0-2",
  "org.webjars" % "typeaheadjs" % "0.10.2",
  "org.webjars" %% "webjars-play" % "2.3.0"  
)
