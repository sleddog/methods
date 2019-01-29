def main():
    quit = True
    while quit:
        try:
            n = int(input("Gimme a number Please: "))
            n += 1
            n -= 1
            
        except ValueError:
            print("What did I just say?")
        else:
            fizzbuzz(n)
            quit = False;
    




def fizzbuzz(n):

    iter = 1
    while iter <= n:
        if iter % 3 == 0 and iter % 5 == 0:
            print("Fizz Buzz")
            
        elif iter % 3 == 0:
            print ("Fizz")
            
        elif iter % 5 == 0:
            print ("Buzz")

        else:
            print(iter)
        iter += 1        

main()    
        
        

        
