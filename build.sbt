name := "scala_repl_template"

scalaVersion := "2.11.8"

version := "0.1"

scalacOptions ++= Seq(
  "-deprecation",
  "-encoding", "UTF-8",       // yes, this is 2 args
  "-feature",
  "-language:existentials",
  "-language:higherKinds",
  "-language:implicitConversions",
  "-unchecked",
  "-Xfatal-warnings",
  "-Xlint:_",
  "-Yno-adapted-args",
  "-Ywarn-dead-code",        // N.B. doesn't work well with the ??? hole
  "-Ywarn-numeric-widen",
  "-Ywarn-value-discard",
  "-Xfuture",
  "-Ybackend:GenBCode",
  "-Ydelambdafy:method",
  "-target:jvm-1.8"
  // very annoying in the REPL
  //"-Ywarn-unused-import"     // 2.11 only
)

libraryDependencies ++= Seq(
  "org.scalaz" %% "scalaz-core" % "7.2.1",
  "org.scalaz" %% "scalaz-concurrent" % "7.2.1",
  "org.tpolecat" %% "doobie-core" % "0.2.3",
  "io.argonaut" %% "argonaut" % "6.1",
  "org.scalaz.stream" %% "scalaz-stream" % "0.8",
  "com.lihaoyi" %% "pprint" % "0.3.8",
  "com.lihaoyi" %% "fastparse" % "0.3.7",
  "org.jsoup" % "jsoup" % "1.8.3",
  "org.scala-lang.modules" % "scala-java8-compat_2.11" % "0.7.0"
)
