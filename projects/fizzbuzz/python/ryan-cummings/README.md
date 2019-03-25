# Fizzbuzz.py

This is a simple program that gets in integer value, n, from the user and prints
1 - n. For multiples of 3, instead of n the program prints "Fizz". For multiples of 5, the program prints "Buzz". For multiples of both 3 and 5, the program prints "FizzBuzz".

## Important

This program is designed to run on Python 3.6 or later.  Please ensure that you are using the correct version of Python. Use of Python 2 could result in errors!

## Instructions for running Fizzbuzz.py

For Bash Terminal or Similar:
1. Open Terminal
2. Check version of Python with:
```bash
    python --version
```
or possibly
```bash
    python3 --version
```

3. When you are certain of your python version run:
```bash
    [correct alias of python] Fizzbuzz.py
```
4. Follow in-program instructions

For other systems or if you'd prefer an IDE over a terminal:

1. Open the IDLE python IDE
2. From the File Menu, open Fizzbuzz.py
3. Run -> Run Module
4. Follow in-program instructions

## Sample Output
```bash
Please enter a positive integer: 10
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

```

## Instructions for running Unit Test for Fizzbuzz.py

For Bash Terminal:
```bash
	[correct alias of python] -m unittest test_Fizbuzz.py
 ```
 The program will run as normal. Follow in-program instructions to run the program to completion. Then, the user will be again asked to enter a positive integer. Enter the number '15'. The unit test to check the input method runs on the assumption that the user enters 15.


## Sample Output
```bash
Please enter a positive integer: 10
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
...Please enter a positive integer: 15
.
----------------------------------------------------------------------
Ran 4 tests in 104.909s

OK

```

