import pytest
from fizzbuzz import calc_fizzbuzz

def test_fizzbuzzbazz():
    rules = {3: 'Fizz', 5: 'Buzz', 7: 'Bazz'}
    assert calc_fizzbuzz(1, rules) == '1'
    assert calc_fizzbuzz(3, rules) == 'Fizz'
    assert calc_fizzbuzz(5, rules) == 'Buzz'
    assert calc_fizzbuzz(7, rules) == 'Bazz'
    assert calc_fizzbuzz(15, rules) == 'FizzBuzz'
    assert calc_fizzbuzz(21, rules) == 'FizzBazz'
    assert calc_fizzbuzz(105, rules) == 'FizzBuzzBazz'

def test_custombuzz():
    rules = {11:'Who', 13:'What', 17:'Where'}
    assert calc_fizzbuzz(1, rules) == '1'
    assert calc_fizzbuzz(11, rules) == 'Who'
    assert calc_fizzbuzz(13, rules) == 'What'
    assert calc_fizzbuzz(17, rules) == 'Where'
    assert calc_fizzbuzz(143, rules) == 'WhoWhat'
    assert calc_fizzbuzz(187, rules) == 'WhoWhere'
    assert calc_fizzbuzz(2431, rules) == 'WhoWhatWhere'
