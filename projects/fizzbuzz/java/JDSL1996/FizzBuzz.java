import java.util.Scanner;

/*
    Joshua Stephenosn-Losey
    Project 2 Industry Methods
    Spring 2019
*/
public class FizzBuzz {
    public static void main(String args[]){
        /*
            TODO: Define a function that will do the following:
                Given input (n), print the numbers from 1 to n
                If the number is a multiple of 3 do not print the number, instead print 'Fizz'
                If the number is a multiple of 5 do not print the number, instead print 'Buzz'
         */
        boolean done = false;
        //while they didnt decide to quit (or type in a negative to try and break it)
        while(!done){
        //catch invalid inputs (catch everything but expecting invalid inputs)
            try{
                //get user inputs...
                Scanner in = new Scanner(System.in);
                //.. with a given prompt
                System.out.println("Give me an n > 0 (no decimals). To make it interesting make it greater that 3...");
                System.out.println("If your done type in 0 to exit");
                int n = in.nextInt();

                if(n<0){
                    //usefull error message
                    throw new ArithmeticException("Thats not a valid number!"); 
                } else if(n == 0){
                    //finis the program uppon request
                    done = true;
                    continue;
                }
                else{
                    //the meat
                    fizz(n);
                }
            }
            //say that the number was wrong
            catch(ArithmeticException e){
                System.out.println(e.getMessage());
                System.out.println();
            }
            //say that an error occured
            catch(Exception e){
                System.out.println("Well that didn't work. Try something else!\n");
            }
        }
    }
    //the solution (meat) of the problem
    private static void fizz(int n){
        //start from the bottom
        int currNum = 1;
        //go to n
        while(currNum <= n){
            //if its a multiple of 3
            if(currNum%3 == 0){
                System.out.print("Fizz");
            }
            //and or if its a multiple of 5
            if(currNum%5 == 0){
                System.out.print("Buzz");
            }
            //or if its not a multiple of 3 or 5
            if(currNum%3 != 0 && currNum%5 != 0){
                System.out.print(currNum);
            }
            //give it some space and incriment
            System.out.println();
            currNum++;
        }
        //give it some more space
        System.out.println();
    }
}