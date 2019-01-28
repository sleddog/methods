## FizzBuzz Program In C

This program takes prompts the user to enter an integer greater than 0 at runtime. The program will loop through each integer from 1 to the given value and checks each value to see if there is a remainder when you divide it by three or five.

* If the integer divides by 3 with no remainder and divides by 5 with no remainder:
	* Print "FizzBuzz"
* If the integer divides by 3 with no remainder:
	* Print "Fizz"
* If the integer divides by 5 with no remainder:
	* Print "Buzz"
* If the integer has a remainder for both dividing by 3 and dividing by five:
	* Print the current number being checked

#### Sample output:

```
w/ n = 17

1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
16
17
```

### Build Steps:

1. clone this repository
2. open your terminal of choice
3. navigate to the directory that FizzBuzz.c is loacated in
4. run the following command in your terminal to compile with GCC:

``` bash
	gcc -o Fizzy -Wall FizzBuzz.c && ./Fizzy
```

### :octocat: Thank you for using FizzBuzz :octocat:
