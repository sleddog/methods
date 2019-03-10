import unittest
from Fizzbuzz import fizz_check, buzz_check, bazz_check, user_in

class testFizzbuzz(unittest.TestCase):

	def test_user_in(self):
		"""This test uses the number 15 as user input"""
		self.assertEqual(user_in(), 15)

	def test_fizz_check_3(self):
		self.assertTrue(fizz_check(3))


	def test_buzz_check_5(self):
		self.assertTrue(buzz_check(5))


	def test_bazz_check_7(self):
		self.assertTrue(bazz_check(7))


	if __name__ == '__main__':
		unittest.main()