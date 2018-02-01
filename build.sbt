
name := "Scala-HTTP-Service"

version := "1.0"

scalaVersion := "2.11.8"

val http4sVersion = "0.17.6"

resolvers ++= Seq(
  "apache-snapshots" at "http://repository.apache.org/snapshots/"
)

libraryDependencies ++= Seq(

  "org.http4s" %% "http4s-dsl" % http4sVersion,
  "org.http4s" %% "http4s-blaze-server" % http4sVersion,
  "org.http4s" %% "http4s-blaze-client" % http4sVersion,
  "net.debasishg" %% "redisclient" % "3.4"
)
