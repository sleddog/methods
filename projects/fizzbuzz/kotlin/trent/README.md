# Project 2: FizzBuzz

## Simple script

The provided `krun.sh` script has three intended modes of operation: zero parameters, one parameter, and three parameters.

### Zero parameters

This mode will first attempt to compile `Fizzbuzz.kt` from the same directory as the script itself. Then, the newly created `.jar` file is run on the default input of `17`. Finally, the new `.jar` file is deleted.

`./krun.sh`

### One parameter

This mode takes the same steps as when run with zero parameters, but allows the user to change the input value to the program. The single input parameter should be a positive integer.

`./krun.sh 35`

### Three parameters

This is the original form of the script and takes the following parameters in this order:

1. path to input Kotlin source file
2. path to output executable `.jar` file
3. the input value

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
3. the input value

`java -jar Fizzbuzz.jar 17`

## Testing

The unit testing function for this project is contained in the `Fizzbuzz.kt` file and is executed each time before the main logic of the program.

To see the output from the tests, be sure to execute the program with the `-ea` flag. This ensures that execution will stop when an `assertionError` is thrown. When executing with the `krun.sh` script, this is done automatically.

`java -jar -ea Fizzbuzz.jar 17`
