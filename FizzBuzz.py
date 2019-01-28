# Simple program that takes an input n, and prints a list of numbers from 1 to n
# if a number is a multiple of 3, the number is replaced with "Fizz"
# else if a number is a multiple of 5 the number is replaced with "Buzz"
# else if a number is a multiple of both 3 and 5, the number is replaced with "FizzBuzz"
#
# Author: Ryan Cummings
# CSCI 494 Industry Methods
# 1/29/2019

# gets n from the user
def user_in():
    number = -1
    while(number <= 0):        # ensures valid input
        try:
            number = int(input("Please enter a positive integer: "))
            if number <= 0:
                print("That is not a positive integer. Please try again.")
        except ValueError:
            number = -1
            print("That is not a positive integer. Please try again.")
    return number

# Checks divisiblity and prints to console
def fizzy(n):
    for i in range(n):
        k = i + 1
        if k % 3 == 0 and k % 5 == 0:
            print("FizzBuzz")
        elif k % 3 == 0:
            print("Fizz")
        elif k % 5 == 0:
            print("Buzz")
        else:
            print(k)

def main():
    upper_bound = user_in()
    fizzy(upper_bound)

main()
