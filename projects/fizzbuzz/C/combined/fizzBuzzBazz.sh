#!/bin/sh

echo 'compiling FizzBuzzBazz...'
gcc -o runMe FBB.c

echo 'launching FizzBuzzBazz...'
./runMe

#cleaning the build after execution
rm runMe
