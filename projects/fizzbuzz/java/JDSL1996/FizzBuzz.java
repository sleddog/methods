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

            Done: 
                Modify program to return "Bazz" when the number is a multiple of 7
         */

        Game g = new Game();
        boolean done = false;
        //while they didnt decide to quit
        while(!done){
            try {
                /*
                    get user input

                    ideally this should be closed at the end but that also closes system.in for the program
                    possible fixes (as found online) are:
                        create a wrapper for system.in that gets closed instead
                        close at the end of the program 
                            (which would be the end of main but the scanner is in this class in a loop so id need to move the scanner decloration taking more memory)
                        force the program to ignore the warnings
                        or just ignore it since its a small program for school where the resource potentially leaked is an integer that doesnt mean anything (i chose this one)
                */  
                Scanner in = new Scanner(System.in);
                //.. with a given prompt
                System.out.println("Give me an n > 0 (no decimals). To make it interesting make it greater that 3...");
                System.out.println("If your done type in 0 to exit");
                int n = in.nextInt();

                if(n<0){
                    //usefull error message
                    throw new ArithmeticException("Thats not a valid number!");
                } else if(n == 0){
                    //finish the program uppon request
                    done = true;
                    continue;
                }
                else{
                    //the meat
                    g.fizz(n);
                }
            }//say that an error occured
            catch(Exception e){
                System.out.println("Well that didn't work. Try something else!");
                System.out.println("Error caught: " + e + "\n");
            }
        }
    }
}