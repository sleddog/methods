def fizzbuzz(n):
    string = ''
    for num in range(1, n+1):
        if num % 3 == 0:
            string += 'Fizz'
        if num % 5 == 0:
            string += 'Buzz'
        if num % 7 == 0:
            string += 'Bazz'
        if num % 3 != 0 and num % 5 != 0 and num % 7 != 0:
            string += str(num)
        
        string += "\n"
    return string

def valid_input(n):
    if n > 1:
        return n
    else:
        return -1

if __name__ == '__main__': # pragma: no cover
    n = -1
    while n == -1:
        n = int(input("Please enter your fizzbuzz number > "))
        n = valid_input(n)
    print(fizzbuzz(n))
