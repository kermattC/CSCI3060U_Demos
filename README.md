# CSCI3060U_Demo
Demo code for CSCI 3060U course

# JUnit Branch
There are 3 java files:

They're both JUnit demos with a few differences

- StackTest.java (courtesy of Nadia Goralski) is for performing JUnit testing on a stack

- StudentDetails.java and StudentDetailsTest.java is for performing JUnit testing on a separate class

How to run JUnit
Note: This guide uses the JUnit standalone platform console from the Maven Repository in order to run the tests. This may not work if you use a different method such as an IDE. In this guide, the latest version 1.8.2 is used. The download link is provided below - download and save the jar file to your desired directory

https://mvnrepository.com/artifact/org.junit.platform/junit-platform-console-standalone/1.8.2

1) compile:
- The path for the JUnit console launcher is required to be specified. After, specify the normal class(es) and test class you want to run
- In the case for this directory, it can be run via:
- Note that if your standalone jar file is stored in a different directory, you'll have to navigate to it using "../" and/or "/<directory name>"

To compile StackTest.java:
```
javac -cp "junit-platform-console-standalone-1.8.2.jar" StackTest.java
```

To compile StudentDetails.java (note that you have to compile both the regular java file as well as the JUnit file):
```
javac -cp "junit-platform-console-standalone-1.8.2.jar" StudentDetails.java StudentDetailsTest.java
```

2) run:
- Just like before, the path for the JUnit console launcher needs to be specified. :
- In the 4th and 5th argument, the class path for the test file also needs to be specified. Since the test class is in the same directory, it can be specified with just "."
- In the 7th argument, you'll have to specify the class that will be conducting the testing

To run StackTest
```
java -jar "junit-platform-console-standalone-1.8.2.jar" -cp "." --select-class=StackTest
```

To run StudentDetailsTest
```
java -jar "junit-platform-console-standalone-1.8.2.jar" -cp "." --select-class=StudentDetailsTest
```