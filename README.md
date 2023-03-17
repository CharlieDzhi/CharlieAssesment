# Ryze

This file contains instructions on how to run this project

1.  This a mvn project so you will need your local machine configured accordingly
2.  The user can download the mvn dependencies by typing "mvn package" from the command line
3.  The cucumber feature file store the steps that each test has.
3.  The test are Junit tests where we use the runner class to execute them(src/test/java/runner.java)
5.  The reporting used is Extent reports, after a test run the report can be found in the following directory Output/Report.html


TYPE mvn -Dtest=runner test to run the tests(This must be done while inside the project)

Another way to run the Test is to click the play button found on the runner class ((src/test/java/runner.java)
