def fizzbuzz(n):
    string = ''
    if n%3 == 0:
        string += "fizz"
    if n%5 == 0:
        string += "buzz"
    if n%7 == 0:
        string += "bazz"
    if n%3 != 0 and n%5 != 0 and n%7 != 0:
        string = n
    return string
    

