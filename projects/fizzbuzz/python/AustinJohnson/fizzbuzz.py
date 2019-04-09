import sys

## I have added comments to hopefully work for my project 3 grade since nobody
## else is currently working on these projects anymore.

## Added 7 divisibility and changed num to i to keep better track of iterator.
## This function was great in my opinion so I didn't change much.
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

## I wanted this function to be able to run pytests and to clean it up
## Therefore I ended up reducing the method from 11 lines to 7.
## This was done by taking out the try/except in this portion of the program.
## Cleaned up getInput method
def getInput(checkNum):
    if checkNum >= 1:
        return checkNum
    elif checkNum == 0:
        sys.exit()
    else:
        return -1

## Added try/except in main to prevent errors when not typing an integer.
## I felt like it was ugly in my getInput method and I had to reaarange
## some things to get pytest to work properly on this program.
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
