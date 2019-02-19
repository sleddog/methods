#!/bin/sh

echo 'Starting unit testing of FizzBuzzBazz...'
echo 'Building the tests...'
export LD_LIBRARY_PATH=/usr/local/lib
gcc -o runTests unitTest.c -lcriterion

echo 'Running the tests...'
./runTests

#cleaning the build after execution
rm runTests
