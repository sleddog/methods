#!/bin/bash
# simple kotlin compile and run
# for fizzbuzz

if [[ $# -eq 0 ]] ; then
	kotlinc Fizzbuzz.kt -include-runtime -d Fizzbuzz.jar
	java -jar Fizzbuzz.jar 17
elif [[ $# -eq 1 ]] ; then
	kotlinc Fizzbuzz.kt -include-runtime -d Fizzbuzz.jar
	java -jar Fizzbuzz.jar $1
else
	kotlinc $1 -include-runtime -d $2
	java -jar $2 $3
fi