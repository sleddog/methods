import sys
from argparse import ArgumentParser

def calc_fizzbuzz(n):
    string = ''
    if n % 3 == 0:
        string += 'Fizz'
    if n % 5 == 0:
        string += 'Buzz'
    if n % 7 == 0:
        string += 'Bazz'
    if string == '':
        string += str(n)

    return string

def fizzbuzz(max):
    for i in range(1, max + 1):
        print(calc_fizzbuzz(i))

def valid_input(n):
    if n > 1:
        return n
    else:
        return -1

if __name__ == '__main__': # pragma: no cover
    parser = ArgumentParser(description="Pass in your fizzbuzz numba!!!")
    parser.add_argument("n")
    args = parser.parse_args()
    n = int(args.n)
    fizzbuzz(n)
