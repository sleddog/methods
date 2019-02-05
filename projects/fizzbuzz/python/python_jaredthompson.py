def function1(num):
    for i in range(1,num+1):
        if (i%3==0 and i%5==0):
            print("fizzbuzz")
        elif i%3==0:
            print("fizz")
        elif i%5==0:
            print("buzz")
        else:
            print(i)

def main():
    print("type in a value:")
    i = int(input())
    print(i)
    if (i > 0 and i < 100):
         function1(i)
    else:
        print("This value is not allowed")

main()
