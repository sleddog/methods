import pytest
from fizzbuzzbazz import fizzbuzz, valid_input

def test_inv_input():
    assert valid_input(-1) == -1

def test_val_input():
    assert valid_input(5) == 5

def test_fizzbuzz():
    string_10 = '1\n2\nFizz\n4\nBuzz\nFizz\nBazz\n8\nFizz\nBuzz\n'
    string_15 = '1\n2\nFizz\n4\nBuzz\nFizz\nBazz\n8\nFizz\nBuzz\n11\nFizz\n13\nBazz\nFizzBuzz\n'
    string_21 = '1\n2\nFizz\n4\nBuzz\nFizz\nBazz\n8\nFizz\nBuzz\n11\nFizz\n13\nBazz\nFizzBuzz\n16\n17\nFizz\n19\nBuzz\nFizzBazz\n'

    assert fizzbuzz(10) == string_10
    assert fizzbuzz(15) == string_15 
    assert fizzbuzz(21) == string_21
