#!/bin/sh

echo 'compiling FizzBuzzBazz...'
gcc -o runMe FizzBuzzBazz.c

echo 'launching FizzBuzzBazz...'
./runMe

#cleaning the build after execution
rm runMe
