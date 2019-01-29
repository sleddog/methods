def fizzbuzz(n):
    string = ''
    if n%3 == 0:
        string += "fizz"
    if n%5 == 0:
        string += "buzz"
    if n%3 != 0 and n%5 != 0:
        string = n
    return string
    
def main():
    input_n = int(input("Enter Int:"))
    [print(fizzbuzz(n)) for n in range(1, input_n+1)]

main()
