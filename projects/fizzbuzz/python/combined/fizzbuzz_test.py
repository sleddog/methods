import pytest
from fizz_buzz import calc_fizzbuzz, valid_input

def test_fizzbuzz():
    string_10 = 'Buzz'
    string_15 = 'FizzBuzz'
    string_21 = 'FizzBazz'

    assert calc_fizzbuzz(10) == string_10
    assert calc_fizzbuzz(15) == string_15
    assert calc_fizzbuzz(21) == string_21
