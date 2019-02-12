def fizzbuzz(n):
    for num in range(1, n+1):
        if num % 3 == 0:
            print("Fizz", end = "")
        if num % 5 == 0:
            print("Buzz", end ="")
        if num % 3 != 0 and num % 5 != 0:
            print(num, end ="")
        print()

n = int(input("Enter your 'fizzbuzz number > "))
fizzbuzz(n)
