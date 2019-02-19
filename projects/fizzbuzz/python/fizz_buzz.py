

def fizz_buzz(num):
    string = ' '
    for i in range(1,num+1):
        if (i%3==0 and i%5==0 and i % 7==0):
            string += "fizzbuzzbazz"
            #print("fizzbuzzbazz")
        elif (i%3==0 and i%5==0):
            string += "fizzbuzz"
            #print("fizzbuzz")
        elif (i%3==0 and i%7==0):
            string += "fizzbazz"
            #print("fizzbazz")
        elif (i%5==0 and i%7==0):
            string += "buzzbazz"
            #print("buzzbazz")
        elif (i%7==0):
            string += "bazz"
            #print("bazz")
        elif i%3==0:
            string += "fizz"
            #print("fizz")
        elif i%5==0:
            string += "buzz"
            #print("buzz")
        else:
            string += str(i);
            #print(i)
        string += "\n"
    return string;

def main():
    print("Type in a value or use negative one to quit:")
    i = int(input())
    print("Your value is " + str(i))
    if (i > 0 and i < 100):
        n = fizz_buzz(i)
        print(n)
    else:
        print("Quit")


main()        

#if __name__ == '__main__':
    #i = int(input("Type in a value or use negative one to quit:"))
    #if (i > 0 and i < 100):
        #n = fizz_buzz(i)
        #print(n)
    #else:
        #print("Quit")
