import java.util.Scanner;

/*
    Joshua Stephenosn-Losey
    Project 2 Industry Methods
    Spring 2019
*/
public class FizzBuzz {
    public static void main(String args[]){
        /*
            Done: Define a function that will do the following:
                Given input (n), print the numbers from 1 to n
                If the number is a multiple of 3 do not print the number, instead print 'Fizz'
                If the number is a multiple of 5 do not print the number, instead print 'Buzz'

            TODO: 
                    Modify program to return “Bazz” when the number is a multiple of 7
                    Add unit tests that validate the function behaves as expected
                    Modify the README to indicate how to run the tests
         */

        Game g = new Game();
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
                    g.fizz(n);
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
}

class Game{
    //the solution (meat) of the problem
    public void fizz(int n){
        //start from the bottom
        int currNum = 1;
        //go to n
        for(currNum = 1; currNum <= n; currNum++){
            String out = "";

            if(three(currNum)){
                out = out.concat("Fizz");
                // System.out.println("three");
            }   
            if(five(currNum)){
                out = out.concat("Buzz");  
                // System.out.println("five");  
            }   
            if(seven(currNum)){
                out = out.concat("Bazz");
                System.out.println(out.length());
            }
            
            if(out.isEmpty()){
                out = String.valueOf(currNum);
            }

            //give it some space and incriment
            System.out.println(out);
        }
        //give it some more space
        System.out.println();
    }

    private boolean three(int num){
        return num%3 == 0;
    }

    private boolean five(int num){
        return num%5 == 0;
    }

    private boolean seven(int num){
        return num%7 == 0;
    }
}