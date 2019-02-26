To run and test this program from the command line on a Windows machine
1. Ensure you have the junit-4.12.jar file in you Classpath
	This can be accomplished temporarily using the "SET CLASSPATH=.;*path to file*;%CLASSPATH%" command (i.e. "SET CLASSPATH=.;D:\Program Files\JetBrains\Intellij IDEA Community Edition 2018.3.4\lib\junit-4.12.jar;%CLASSPATH%")
2. Run the command "javac Rost.java RostTest.java" to compile both of the java classes
3. To run the main program use the command "java Rost n" where n is the number you with the program to count up to
4. To run the unit test, use the command "java RostTest n" where n is the number you want the program test to count up to, which will either give the location an error in the program occurred, or tell you the program passed the test