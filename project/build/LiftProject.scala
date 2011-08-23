import sbt._

class LiftProject(info: ProjectInfo) extends DefaultWebProject(info) with IdeaProject {
  val liftVersion = "2.3"

  // uncomment the following if you want to use the snapshot repo
  //  val scalatoolsSnapshot = ScalaToolsSnapshots

  // If you're using JRebel for Lift development, uncomment
  // this line
  // override def scanDirectories = Nil

  override def libraryDependencies = Set(
    "net.liftweb" %% "lift-webkit" % liftVersion % "compile",
    "net.liftweb" %% "lift-mapper" % liftVersion % "compile",
    "net.liftweb" %% "lift-ldap" % liftVersion % "compile",
    "org.jboss.netty" % "netty" % "3.2.3.Final",
    "log4j" % "log4j" % "1.2.16",
    "org.slf4j" % "slf4j-log4j12" % "1.6.1",
    "org.mortbay.jetty" % "jetty" % "6.1.22" % "test",
    "junit" % "junit" % "4.5" % "test",
    "org.scala-tools.testing" %% "specs" % "1.6.6" % "test",
    "org.mockito" % "mockito-all" % "1.8.5" % "test",
    "c3p0" % "c3p0" % "0.9.1.2",
    "com.h2database" % "h2" % "1.2.138",
    "mysql" % "mysql-connector-java" % "5.1.9"
  ) ++ super.libraryDependencies

  override def jettyPort = 9333
}
