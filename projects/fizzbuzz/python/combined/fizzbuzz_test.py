import pytest
from fizz_buzz import calc_fizzbuzz

def test_fizzbuzzbazz():
    assert calc_fizzbuzz(1) == '1'
    assert calc_fizzbuzz(3) == 'Fizz'
    assert calc_fizzbuzz(5) == 'Buzz'
    assert calc_fizzbuzz(7) == 'Bazz'
    assert calc_fizzbuzz(15) == 'FizzBuzz'
    assert calc_fizzbuzz(21) == 'FizzBazz'
    assert calc_fizzbuzz(105) == 'FizzBuzzBazz'

def test_custombuzz():
    rules = {11:'Who', 13:'What', 17:'Where'}
    assert calc_fizzbuzz(1, rules) == '1'
    assert calc_fizzbuzz(11, rules) == 'Who'
    assert calc_fizzbuzz(13, rules) == 'What'
    assert calc_fizzbuzz(17, rules) == 'Where'
    assert calc_fizzbuzz(143, rules) == 'WhoWhat'
    assert calc_fizzbuzz(187, rules) == 'WhoWhere'
    assert calc_fizzbuzz(2431, rules) == 'WhoWhatWhere'
