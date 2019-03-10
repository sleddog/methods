# Combined Python FizzBuzz

Before running the program you must obtain the source code and navigate into this directory. From here there are two intended modes of operation, FizzBuzzBazz and Interactive.

## FizzBuzzBazz mode

Run the program with either of the following commands, replacing 17 with the intended maximum number for the execution

`./fizzbuzz.py 17`

`python fizzbuzz.py 17`

## Interactive mode

Simply pass the `-i` flag to enter interactive mode, where you will be prompted to enter the rules you would like to use for the execution. As above, replace 17 in the following commands with the intended maximum.

`./fizzbuzz.py -i 17`

`python fizzbuzz.py -i 17`

## Testing

1. This test suite uses the pytest module. To install, run the following command:

         pip3 install pytest pytest-cov

3. navigate to the directory `projects/fizzbuzz/python/combined`. Then, run the following command to run the unit tests:

         pytest --cov=. fizzbuzz_test.py