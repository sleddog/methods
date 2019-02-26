import unittest
from fizzbuzz import inpTest


class TestMethods(unittest.TestCase):

    def test_Fizz(self):
        self.assertEqual(inpTest(3), 1)

    def test_Buzz(self):
        self.assertEqual(inpTest(5), 1)

    def test_Bazz(self):
        self.assertEqual(inpTest(7), 1)    

    # assertEqual (type(main.))