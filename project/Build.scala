import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "MusicVoting"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
      // Add your project dependencies here,
        "com.google.code.gson" % "gson" % "1.7.1"

    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = JAVA).settings(
      // Add your own project settings here      
    )

}
