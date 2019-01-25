#!/bin/bash
# simple kotlin compile and run
# for fizzbuzz

kotlinc $1 -include-runtime -d $2
java -jar $2 $3