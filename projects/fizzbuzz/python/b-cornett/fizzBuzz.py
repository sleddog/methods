#FizzBuzz program, prints Fizz if the mod operator returns 0 for 3, Buzz if the mod operator returns 0, and FizzBuzz
#if both of them return 0

#=================================
#Function for FizzBuzz iteration
#=================================
def fizzbuzz(number):
    output = ""
    divis = False
    if (number % 3) == 0:
        output += "Fizz"
        divis = True
    if (number % 5) == 0:
        output += "Buzz"
        divis = True
    if (number % 7) == 0:
        output += "Bazz"
        divis = True
    if divis != True:
        return (number)
    else:
        return (output)

#=================================
#Driver section of python script
#=================================
def main():
        try:
            inpNumber = int(input("Enter number for FizzBuzz function: "))
            if inpNumber <= 0:
                print("INVALID INPUT: Please enter a positive integer.")
            else:
                counter = 1
                # While loop for iterating through user input
                while counter <= inpNumber:
                    print(fizzbuzz(counter))
                    counter = counter + 1
        except ValueError:
            print("INVALID INPUT: Please enter a positive integer.")

#=============================
# Execution of the program
#=============================

if __name__ == '__main__':
    main()
