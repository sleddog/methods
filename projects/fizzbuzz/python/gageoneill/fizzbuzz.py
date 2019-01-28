# Gage O'Neill
# CSCI 494
# Project 2

'''
Define a function that will do the following:
    Given input (n), print the numbers from 1 to n
    If the number is a multiple of 3 do not print the number, instead print 'Fizz'
    If the number is a multiple of 5 do not print the number, instead print 'Buzz'
'''

if __name__ == '__main__':
    while True:
        try:
            n = int(raw_input('Enter a positive integer: '))
            if n < 0:
                print('Must be positive')
                continue
            break
        except ValueError:
            print 'Invalid number'

    for num in range(1, n + 1):
        if num % 3 == 0 and num % 5 == 0:
            print ('FizzBuzz')
        elif num % 5 == 0:
            print('Buzz')
        elif num % 3 == 0:
            print('Fizz')
        else:
            print(num)
