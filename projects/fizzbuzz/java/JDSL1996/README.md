<!-- Done: Modify the README to indicate how to run the tests -->
# FizzBuzz in Java

Created by Joshua Stephenson-Losey

## How to run The TestSuite

Included in this project is a test suite that runs trough a number of tests to check each expected output type namely:

* The current int in counting
* The word Fizz, Buzz, or Bazz from multiples of 3, 5, or 7 respectively
* The combination of the above words for multiple-multiples
* The output will be true if all tests pass

### Pre-setup

* Java Development kit to compile and run java code (I'm unsure of oldest possible vertion but I am running JDK 11 available [here](https://www.oracle.com/technetwork/java/javase/downloads/jdk11-downloads-5066655.html))
* JUnit which can be found [here](https://www.tutorialspoint.com/junit/junit_environment_setup.htm) at tutorials point with instructions (The actual JUnit instructions from their github page do not seem to actually get JUnit working so these instructions are better in my opinion)
  * **NOTE:** The tutorial is not consistent with file names and files downloaded, be sure to use the names of the files you actually have **not** the names given in the tutorial.

### Command Prompt Execution

Type in the following to run the Test Suite:

```
javac TestSuit.java
java TestRunner
```

If all tests pass the output will be `true` otherwise the failed tests will show with what caused them to fail

## How to Run The Program

Depending on if you use an IDE or not this step will be different so I will give instructions for a the two possibilities that are readily available and somewhat compatable across use cases.

### - Visual Studio Code or the Command Prompt/ Terminal

This was writted using visual studio code which has many java debuggers and language support extentions however they dont seem to support user input from the terminal window as required by this program (its more set up for running test cases on java files) thererfor if using VSCode the terminal window is used to compile and run the code ussing these steps:

1) Open the terminal window in the directory containing the FizzBuzz.java file.
2) Type in the following where the first line creates a .class file and the second executes it:

    `javac FizzBuzz.java`

    `java FizzBuzz`
3) That starts the program running now just follow the prompts!

### - IntelliJ and simmilar IDE's

1) Create a new project with the standard settings, name it something meaningful (like FizzBuzz) and put it somewhere you can find it
2) Place the FizzBuzz.java file in the src folder (you can drag it right into the program and it will prompt you to move it)
3) Right click on the FizzBuzz file (in Intellij) and click the run option (about halfway down)
4) That starts the program running now just follow the prompts!