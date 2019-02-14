# Project 2: FizzBuzz

## Simple script

Run the `krun.sh` script with the maximum value to compile and run the program using the assumed location for the input file and the input parameter.

`./krun.sh 105`

## Simple script with parameters

Run the `krun.sh` script with the following parameters to compile and run the program in one command

1. path to input Kotlin source file
2. path to output `.jar` file
3. the maximum value

`./krun.sh Fizzbuzz.kt Fizzbuzz.jar 17`

## Compile from source

Use the `kotlinc` compiler with the following parameters to compile the source code

1. path to input Kotlin source file
2. `-include-runtime`
3. `-d`
4. path to output .jar file

`kotlinc Fizzbuzz.kt -include-runtime -d Fizzbuzz.jar`

## Run .jar file

Use `java` with the following arguments to execute the program

1. `-jar`
2. path to executable `.jar` file
3. the maximum value

`java -jar Fizzbuzz.jar 17`