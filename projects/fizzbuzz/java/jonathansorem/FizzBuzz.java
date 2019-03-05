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
        
        //Function call to print
        
        //Print the numbers
        for (int i = 1; i <= amount; i++)
        {
            System.out.println (Print(i));
        }
    }
    public static String Print(int amount)
    {
        //If not divisible by 3 or 5
         if (amount%3 != 0 && amount%5 != 0 && amount%7 != 0)
        {
            return (Integer.toString(amount));
        }
        else
        {
            //If number is divisible by 3, 5, and 7
            if (amount%3 == 0 && amount%5 == 0 && amount%7 == 0)
            {
                return ("FizzBazzBuzz");
            }
            //If number is divisible by 3 and 5
            if (amount%3 == 0 && amount%5 == 0 && amount%7 != 0)
            {
                return ("FizzBazz");
            }
            //If number is divisible by 3 and 7
            if (amount%3 == 0 && amount%5 != 0 && amount%7 == 0)
            {
                return ("FizzBuzz");
            }
            //If number is divisible by 5 and 7
            if (amount%3 != 0 && amount%5 == 0 && amount%7 == 0)
            {
                return ("BazzBuzz");
            }
            //If number is divisible by 3
            if (amount%3 == 0 && amount%5 != 0 && amount%7 != 0)
            {
                return ("Fizz");
            }
            //If number is divisible by 5
            if (amount%5 == 0)
            {
                return ("Buzz");
            }
            //If number is divisible by 7
            if (amount%7 == 0)
            {
                return ("Bazz");
            }
        }   
        return "error";
    }
}
