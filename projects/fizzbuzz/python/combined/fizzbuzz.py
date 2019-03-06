#!/usr/bin/env python3

from argparse import ArgumentParser

def calc_fizzbuzz(n, rules = None):
    string = ''
    for divisor, result in rules.items():
        if n % divisor == 0:
            string += result

    if string == '':
        string += str(n)
    return string

def create_rules():
    print('Welcome to the interactive rule generator, to exit submit an empty string as a divisor')

    ruleset = {}
    while True:
        temp = input('Please enter a divisor: ')
        if temp == '':
            break
        ruleset[int(temp)] = input('Please enter the result: ')
    return ruleset

def fizzbuzz(max, rules = None):
    for i in range(1, max + 1):
        print(calc_fizzbuzz(i, rules))

if __name__ == '__main__': # pragma: no cover
    parser = ArgumentParser(description="Pass in your fizzbuzz numba!!!")
    parser.add_argument("n", help='Please provide a positive integer for the maximum value')
    parser.add_argument("-i", help='Use this option to enter interactive mode and define the rules before executing', dest='interactive', action='store_true')
    args = parser.parse_args()
    n = int(args.n)

    if args.interactive:
        # interactive mode selected
        ruleset = create_rules()
        fizzbuzz(n, ruleset)
    else:
        # defaulting to FizzBuzzBazz
        ruleset = {3: 'Fizz', 5: 'Buzz', 7: 'Bazz'}
        fizzbuzz(n, ruleset)
