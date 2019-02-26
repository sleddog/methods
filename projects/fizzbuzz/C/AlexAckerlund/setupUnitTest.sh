#!/bin/sh

echo 'Begining Unit Test for FizzBuzz.c ...'
echo 'Build the file for execution ...'
export LD_LIBRARY_PATH=/usr/local/lib
gcc -o unitTest UnitTest.c -lcriterion
echo 'Build successful'

./runUnitTest.sh

