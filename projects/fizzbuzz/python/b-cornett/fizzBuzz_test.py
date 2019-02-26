# Unit testing file for FizzBuzz

import unittest
from fizzBuzz import fizzbuzz

#========================================
# Class for Unit Testing
#========================================
class test(unittest.TestCase):
    def test3(self):
        self.assertEqual(fizzbuzz(3), "Fizz")
    def test5(self):
        self.assertEqual(fizzbuzz(5), "Buzz")
    def test7(self):
        self.assertEqual(fizzbuzz(7), "Bazz")
    def test15(self):
        self.assertEqual(fizzbuzz(15), "FizzBuzz")
    def test21(self):
        self.assertEqual(fizzbuzz(21), "FizzBazz")
    def test35(self):
        self.assertEqual(fizzbuzz(35), "BuzzBazz")
    def test105(self):
        self.assertEqual(fizzbuzz(105), "FizzBuzzBazz")
    def test4(self):
        self.assertEqual(fizzbuzz(4), 4)

#=======================
# Execution of Program
#=======================
if __name__ == '__main__':
    unittest.main()