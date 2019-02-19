import pytest

from fizz_buzz import fizz_buzz


def test_fizzbuzz():
    fizzbuzz_string5 = ' 1\n2\nfizz\n4\nbuzz\n'
    fizzbuzz_string10 = ' 1\n2\nfizz\n4\nbuzz\nfizz\nbazz\n8\nfizz\nbuzz\n'
    fizzbuzz_string21 =' 1\n2\nfizz\n4\nbuzz\nfizz\nbazz\n8\nfizz\nbuzz\n11\nfizz\n13\nbazz\nfizzbuzz\n16\n17\nfizz\n19\nbuzz\nfizzbazz\n'


    assert fizz_buzz(10) == fizzbuzz_string10
    assert fizz_buzz(5) == fizzbuzz_string5
    assert fizz_buzz(21) == fizzbuzz_string21


