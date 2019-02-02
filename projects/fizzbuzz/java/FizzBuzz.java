package fizzbuzz;

import java.util.Scanner;

public class FizzBuzz
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        //User enters a number
        System.out.println("Enter a number:");
        int amount = input.nextInt();
        
        //Print the numbers
        for (int i = 1; i <= amount; i++)
        {
            //If number is divisible by 3
            if (i%3 == 0)
            {
                System.out.print ("Fizz");
            }
            //If number is divisible by 5
            if (i%5 == 0)
            {
                System.out.print ("Buzz");
            }
            //If not divisible by 3 or 5
            if (i%3 != 0 && i%5 != 0)
            {
                System.out.print (i);
            }
            System.out.println("");
        }
    }
    
}
