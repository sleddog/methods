import pytest
from fizzbuzz import fizzBuzz, getInput

def test_fizzbuzz():
    assert fizzBuzz(1) == '1\n'
    assert fizzBuzz(3) == '1\n2\nFizz\n'
    assert fizzBuzz(7) == '1\n2\nFizz\n4\nBuzz\nFizz\nBazz\n'
    assert fizzBuzz(10) == '1\n2\nFizz\n4\nBuzz\nFizz\nBazz\n8\nFizz\nBuzz\n'

def test_input():
    assert getInput(5) == 5
    assert getInput(-20) == -1
