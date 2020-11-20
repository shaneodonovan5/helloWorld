/* 	hello world java project
	project to be built using Gradle (installed from binaries, PATH to gradle/bin set)
	project name by default = folder name (change using settings.gradle file)
	
	convention:
	source code in src/main/java/hello
	hello package name
	
	cf build.gradle in root directory for project
	to build "gradle build" in project folder (i.e. helloworldjava)
	to run "gradle run"
	
	gradle supports Maven repositories for library dependencies
*/

package hello;


import org.joda.time.LocalTime;					// JODA 3rd party library 2.10.1


public class HelloWorld
{
	public static void main(String[] args)
	{
		System.out.println("hello world Gradle, time is " + new LocalTime());
	}
}

/* build outputs:

build/classes			java/main/HelloWorld.class
build/reports			unit test results (if any)
build/libs				helloworld-1.0.1.jar

gradle uses DAG to determine tasks to be completed before specified task
e.g. gradle run will do a build if source code has changed

preferred way to build using gradle is via the gradle wrapper which does not require gradle install (e.g. CI/CD) on build machine
run "gradle wrapper" to install script which can be used to build and check script into version control
run "gradelw build" to build using wrapper script
targets specific gradle version
*/
