# gets n from the user
def user_in():
    number = -1

    while(number <= 0):        # ensures valid input
        try:
            number = int(input("Please enter a positive integer: "))
            if number <= 0:
                print("That is not a positive integer. Please try again.")
        except ValueError:
            number = -1
            print("That is not a positive integer. Please try again.")
    return number


def fizz_check(n):
    if n % 3 == 0:
        return True
    else:
        return False


def buzz_check(n):
    if n % 5 == 0:
        return True
    else:
        return False


def bazz_check(n):
    if n % 7 == 0:
        return True
    else:
        return False


def calculate(n):
    for i in range(n):
        l = [fizz_check(i + 1), buzz_check(i + 1), bazz_check(i + 1)]
        a = ""
        b = ""
        c = ""

        if l[0]:
            a = "Fizz"
        if l[1]:
            b = "Buzz"
        if l[2]:
            c = "Bazz"

        print_results(i, a, b, c, l)


def print_results(iterator, fizz, buzz, bazz, results_list):
    if not any(results_list):
        print(iterator + 1)
    else:
        print(fizz + buzz + bazz)


def main():
    upper_bound = user_in()
    calculate(upper_bound)
        

main()