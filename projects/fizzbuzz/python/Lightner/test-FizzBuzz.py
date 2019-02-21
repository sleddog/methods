import unittest
import FizzBuzz

class TestFizzBuzz(unittest.TestCase):

    def test_normal(self):
        #tests that input >= 0 not evenly divisible
        #by 3,5, or 7 returns the same
        self.assertEqual(FizzBuzz.fizzbuzz(2), 2)
        self.assertEqual(FizzBuzz.fizzbuzz(67), 67)
        self.assertEqual(FizzBuzz.fizzbuzz(358), 358)
    def test_fizz(self):
        #input evenly divisible by 3 returns fizz
        self.assertEqual(FizzBuzz.fizzbuzz(3), 'Fizz')
        self.assertEqual(FizzBuzz.fizzbuzz(9), 'Fizz')
        self.assertEqual(FizzBuzz.fizzbuzz(138), 'Fizz')
    def test_buzz(self):
        #input evenly divisible by 5 reutrns buzz
        self.assertEqual(FizzBuzz.fizzbuzz(5), 'Buzz')
        self.assertEqual(FizzBuzz.fizzbuzz(10), 'Buzz')
        self.assertEqual(FizzBuzz.fizzbuzz(65), 'Buzz')
    def test_bazz(self):
        #input evenly divisible by 7 returns bazz
        self.assertEqual(FizzBuzz.fizzbuzz(7), 'Bazz')
        self.assertEqual(FizzBuzz.fizzbuzz(77), 'Bazz')
        self.assertEqual(FizzBuzz.fizzbuzz(98), 'Bazz')
    def test_fizz_buzz(self):
        #input evenly divisble by 3 and 5 returns fizzbuzz
        self.assertEqual(FizzBuzz.fizzbuzz(15), 'FizzBuzz')
        self.assertEqual(FizzBuzz.fizzbuzz(30), 'FizzBuzz')
        self.assertEqual(FizzBuzz.fizzbuzz(60), 'FizzBuzz')
    def test_fizz_bazz(self):
        #input evenly divisible by 3 and 7 returns fizzbazz
        self.assertEqual(FizzBuzz.fizzbuzz(21), 'FizzBazz')
        self.assertEqual(FizzBuzz.fizzbuzz(42), 'FizzBazz')
        self.assertEqual(FizzBuzz.fizzbuzz(84), 'FizzBazz')
    def test_buzz_bazz(self):
        #input evenly divisible by 5 and 7 returns buzzbazz
        self.assertEqual(FizzBuzz.fizzbuzz(35), 'BuzzBazz')
        self.assertEqual(FizzBuzz.fizzbuzz(70), 'BuzzBazz')
        self.assertEqual(FizzBuzz.fizzbuzz(455), 'BuzzBazz')
    def test_fizz_buzz_bazz(self):
        #input evenly divisible by 3, 5, and 7 returns fizzbuzzbazz
        self.assertEqual(FizzBuzz.fizzbuzz(105), 'FizzBuzzBazz')
        self.assertEqual(FizzBuzz.fizzbuzz(210), 'FizzBuzzBazz')
        self.assertEqual(FizzBuzz.fizzbuzz(315), 'FizzBuzzBazz')


if __name__ == '__main__':
    unittest.main()     
