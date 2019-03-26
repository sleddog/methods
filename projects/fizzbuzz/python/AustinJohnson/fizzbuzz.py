def getInput():
    inputNumber = -1
    while inputNumber < 0:
        try:
            inputNumber = int(input("Please enter the number you would like to check (0 to quit): "))
            if inputNumber >= 0:
                return inputNumber
            else:
                print("Not an accepted number, please input a positive integer.")
        except ValueError:
            print("Not a valid input. Please enter a positive integer.")

def fizzBuzz(input):
    string = ''
    for num in range(1, input+1):
        if num % 3 == 0:
            string += 'Fizz'
        if num % 5 == 0:
            string += 'Buzz'
        if num % 3 != 0 and num % 5 != 0:
            string += str(num)
        string += "\n"

    return string

def main():
    ProgramRun = True
    while ProgramRun:
        input = getInput()
        if input == 0:
            ProgramRun = False
            break
        finalOutput = fizzBuzz(input)
        print(finalOutput)
main()
