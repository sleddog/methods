#!/usr/bin/env python3
from argparse import ArgumentParser

def calc_fizzbuzz(n, rules = None):
    string = ''
    if rules == None:
    # no rules were passed in, do FizzBuzzBazz
        if n % 3 == 0:
            string += 'Fizz'
        if n % 5 == 0:
            string += 'Buzz'
        if n % 7 == 0:
            string += 'Bazz'
    else:
    # some rules were passed in, use the custom rules
        for divisor, result in rules.items():
            if n % divisor == 0:
                string += result
    if string == '':
        string += str(n)
    return string

def fizzbuzz(max, rules = None):
    for i in range(1, max + 1):
        print(calc_fizzbuzz(i, rules))

if __name__ == '__main__': # pragma: no cover
    parser = ArgumentParser(description="Pass in your fizzbuzz numba!!!")
    parser.add_argument("n")
    args = parser.parse_args()
    n = int(args.n)

    wordRules = {11: 'Who', 13: 'What', 17: 'Where'}

    # fizzbuzz(n)
    fizzbuzz(n, wordRules)