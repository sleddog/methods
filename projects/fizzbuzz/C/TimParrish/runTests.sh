#!/bin/sh

echo 'Starting unit testing of FizzBuzzBazz...'
echo 'Building building the tests...'
gcc -o runTests unitTest.c -lcriterion

echo 'Running the tests...'
./runTests

#cleaning the build after execution
rm runTests
