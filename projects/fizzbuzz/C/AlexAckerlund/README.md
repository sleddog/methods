### Welcome to FizzBuzz in C with unit testing

This program takes and integer that is greater than 0 as user input. The program then loops through from 1 to the user input and checks if the number is divisible by 3, 5, and 7.

If the number is divisible by 3, print "Fizz" to the screen
If the number is divisible by 5, print "Buzz" to the screen
If the number is divisible by 7, print "Bazz" to the screen

### Sample execution

```
enter a number greater than 0: 28
1
2
Fizz 
4
Buzz 
Fizz 
Bazz 
8
Fizz 
Buzz 
11
Fizz 
13
Bazz 
Fizz Buzz 
16
17
Fizz 
19
Buzz 
Fizz Bazz 
22
23
Fizz 
Buzz 
26
Fizz 
Bazz 
```

### Instructions for initial setup of unit testing

```
$ ./criterionSetup.sh
```
This will run all the necesary commands to install and compile Criterion.
*Note: It is possible that some dependecies will not be installed. These will need to be installed
Note 2: This can take some time to completely run
Note 3: In the event that this file finishes with an error run the following commands.*
```
$ git clone --recursive https://github.com/Snaipe/Criterion
$ cd Criterion
$ sudo mkdir build
$ cd build
$ sudo cmake ..
$ sudo cmake --build .
$ sudo make install

```
*The above commands are the main contents of criterionSetup.sh except they are prefaced with sudo where appropriate.*
*Now setup the unit test by doing

```
$ ./setupUnitTest.sh
```

This will setup AND run the unit test

### Instructions for running the unit test

```
$ ./runUnitTest.sh
```

*Note: If you have not done the initial setup for the unit test this will not work.*


### Instructions for initial setup of FizzBuzz

```
$ ./setupFizzBuzz.sh
```

This will setup and run FizzBuzz


### Instruction for running FizzBuzz

```
$ ./runFizzBuzz.sh
```

This will run FizzBuzz
*Note: THe initial setup must be run before FizzBuzz will run*

### Some common errors and their solutions

* I am unable to run file.sh
```
$ chmod +x file.sh
```
