import sys


## Added 7 divisibility and changed num to i to keep better track of iterator.
def fizzBuzz(input):
    string = ''
    for i in range(1, input+1):
        if i % 3 == 0:
            string += 'Fizz'
        if i % 5 == 0:
            string += 'Buzz'
        if i % 7 == 0:
            string += 'Bazz'
        if i % 3 != 0 and i % 5 != 0 and i % 7 != 0:
            string += str(i)
        string += "\n"
    return string

def getInput(checkNum):
    if checkNum >= 1:
        return checkNum
    elif checkNum == 0:
        sys.exit()
    else:
        return -1

if __name__ == '__main__':
    while True:
        inputNum = 0
        try:
            inputNum = int(input("Please enter the number you would like to check (0 to quit): "))
        except:
            print("Not an integer, please input an integer.")
            continue
        inputNum = getInput(inputNum)
        if(inputNum == -1):
            print("Not an accepted number, please input a positive integer.")
        print(fizzBuzz(inputNum))
