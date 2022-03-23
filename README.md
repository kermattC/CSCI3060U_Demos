# CSCI3060U_Demo
Demo code for CSCI 3060U course

# JUnit Branch
How to run JUnit
Note: This guide uses the JUnit standalone platform console from the Maven Repository in order to run the tests. This may not work if you use a different method such as an IDE. In this guide, the latest version 1.8.2 is used. The download link is provided below - download and save the jar file to your working directory

https://mvnrepository.com/artifact/org.junit.platform/junit-platform-console-standalone/1.8.2

1) compile:
- The path for the JUnit console launcher is required to be specified. After, specify the normal class(es) and test class you want to run
- In the case for this directory, it can be run via:

javac -cp "junit-platform-console-standalone-1.8.2.jar" StackTestLesson.java

- Note that if your standalone jar file is stored in a different directory, you'll have to navigate to it using "../" and/or "/<directory name>"

2) run:
- Just like before, the path for the JUnit console launcher needs to be specified. :
- In the 4th and 5th argument, the class path for the test file also needs to be specified. Since the test class is in the same directory, it can be specified with just "."
- In the 7th argument, you'll have to specify the class that will be conducting the testing

java -jar "junit-platform-console-standalone-1.8.2.jar" -cp "." --select-class=StackTestLesson