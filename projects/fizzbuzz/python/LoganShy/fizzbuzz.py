def main():
    # Simple try catch to prevent type mismatch
    quit = True
    while quit:
        try:
            n = int(input("Please enter a number: "))
            n += 1
            n -= 1

        except ValueError:
            print("You did not enter a number. Please try again")
        else:
            fizzbuzz(n)
            quit = False


#  Functions that test for multiples of 3, 5 and 7
def fizzTest(n):
    if n % 3 == 0:
        print("Fizz ", end='')
        return 1
    else:
        return 0


def buzzTest(n):
    if n % 5 == 0:
        print("Buzz ", end='')
        return 1
    else:
        return 0


def bazzTest(n):
    if n % 7 == 0:
        print("Bazz ", end='')
        return 1
    else:
        return 0


def fizzbuzz(n):

    iter = 1

    while iter <= n:
        flag = 0
        flag = fizzTest(iter) + buzzTest(iter) + bazzTest(iter)
        if flag == 0:
            print(iter, end='\n')
        else:
            print()
        iter += 1


def inpTest(n):
    if n % 3 == 0:
        return 1
    elif n % 5 == 0:
        return 1
    elif n % 7 == 0:
        return 1
    else:
        return 0


main()