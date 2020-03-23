name := "scala-lwjgl"
organization := "com.amdelamar"
version := "1.0"
scalaVersion := "2.13.1"

libraryDependencies ++= {
  // LWJGL dependencies go here
  val version = "3.2.3"
  val natives = "natives-linux"
  Seq(
    "lwjgl",
    "lwjgl-glfw",
    "lwjgl-openal",
    "lwjgl-opengl",
  ).flatMap {
    module =>
      Seq(
        "org.lwjgl" % module % version,
        "org.lwjgl" % module % version classifier natives
      )
  }
}

libraryDependencies ++= Seq(
  // other dependencies go here
)

lazy val root = (project in file("."))
enablePlugins(JavaAppPackaging)

