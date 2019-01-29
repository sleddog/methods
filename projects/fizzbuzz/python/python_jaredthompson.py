def function1(num):
    for i in range(1,num+1):
        if (i%3==0 and i%5==0):
            print("fizz" + "buzz")
        elif i%3==0:
            print("fizz")
        elif i%5==0:
            print("buzz")
        else:
            print(i)

n = 17
l = 7

function1(n)
print()
function1(l)
