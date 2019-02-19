#FizzBuzz program, prints Fizz if the mod operator returns 0 for 3, Buzz if the mod operator returns 0, and FizzBuzz
#if both of them return 0

import unittest
import sys

#=================================
#Function for FizzBuzz iteration
#=================================
def fizzbuzz(number):
    output = ""
    divis = False
    if (number % 3) == 0:
        output += "Fizz"
        divis = True
    if (number % 5) == 0:
        output += "Buzz"
        divis = True
    if (number % 7) == 0:
        output += "Bazz"
        divis = True
    if divis != True:
        return (number)
    else:
        return (output)

#=================================
#Driver section of python script
#=================================
def main():
     # First try and except to allow for 0 arguments to be passed.
    try:
        if sys.argv[1].lower() == "test":
            del sys.argv[1:]
            unittest.main()
        else:
            print("INVALID ARGUMENT: Please enter 'test' for unit tests or leave blank for live run.")
    except IndexError:
        # Second try and except for catching invalid user input
        try:
            inpNumber = int(input("Enter number for FizzBuzz function: "))
            if inpNumber <= 0:
                print("INVALID INPUT: Please enter a positive integer.")
            else:
                counter = 1
                # While loop for iterating through user input
                while counter <= inpNumber:
                    print(fizzbuzz(counter))
                    counter = counter + 1
        except ValueError:
            print("INVALID INPUT: Please enter a positive integer.")

#==============================================================
# Class for unit testing. Called through command line argument
#==============================================================
class test(unittest.TestCase):
    def test(self):
        self.assertEqual(fizzbuzz(3), "Fizz")
        self.assertEqual(fizzbuzz(5), "Buzz")
        self.assertEqual(fizzbuzz(7), "Bazz")
        self.assertEqual(fizzbuzz(15), "FizzBuzz")
        self.assertEqual(fizzbuzz(21), "FizzBazz")
        self.assertEqual(fizzbuzz(35), "BuzzBazz")
        self.assertEqual(fizzbuzz(105), "FizzBuzzBazz")

#=============================
# Execution of the program
#=============================
main()