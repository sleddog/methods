#!/bin/bash
# simple kotlin compile and run
# for fizzbuzz

if [ $# -eq 0 ]; then
	kotlinc Fizzbuzz.kt -include-runtime -d Fizzbuzz.jar
	java -jar -ea Fizzbuzz.jar 17
	rm Fizzbuzz.jar
elif [[ $# -eq 1 ]] ; then
	kotlinc Fizzbuzz.kt -include-runtime -d Fizzbuzz.jar
	java -jar -ea Fizzbuzz.jar $1
	rm Fizzbuzz.jar
else
	kotlinc $1 -include-runtime -d $2
	java -jar -ea $2 $3
fi

