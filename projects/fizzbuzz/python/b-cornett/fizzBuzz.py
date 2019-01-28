#FizzBuzz program, prints Fizz if the mod operator returns 0 for 3, Buzz if the mod operator returns 0, and FizzBuzz
#if both of them return 0

#Function for FizzBuzz iteration
def fizzbuzz(number):
    counter = 1
    # while loop for iterating through user input
    while counter <= number:
        if (counter % 3 == 0) and (counter % 5 == 0):
            print("FizzBuzz")
        elif (counter % 3) == 0:
            print("Fizz")
        elif (counter % 5) == 0:
            print("Buzz")
        else:
            print(counter)
        counter = counter + 1

#variable for user input
try:
    inpNumber = int(input("What number do you want to count to? "))
    if inpNumber <= 0:
        print ("Invalid input. Please enter a positive integer.")
    fizzbuzz(inpNumber)
except ValueError:
    print ("Invalid input. Please enter a positive integer.")
