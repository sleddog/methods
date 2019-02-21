
def fizzbuzz(num):
    if num % 3 == 0 and num % 5 == 0 and num % 7 == 0:
        return('FizzBuzzBazz')
    elif num % 3 == 0 and num % 5 == 0:
        return('FizzBuzz')
    elif num % 3 == 0 and num % 7 == 0:
        return('FizzBazz')
    elif num % 5 == 0 and num % 7 == 0:
        return('BuzzBazz')
    elif num % 3 == 0:
        return('Fizz')
    elif num % 5 == 0:
        return('Buzz')
    elif num % 7 == 0:
        return('Bazz')
    else:
        return(num)
        


while True:
    try:
        n = int(input("Enter number: "))
        break
    except ValueError:
        print("Invalid input. Try again.")
    
        
        
if n < 1:
    print('Not a positive integer')
for number in range(1, n):
    print (fizzbuzz(number))
