/*
 * This is a function to iterate number of times the user inputs, or default to 
 * 200 iterations if input is invalid,
 * if the number is divisible by 3 fizz, 5 buzz, 7 bazz, 
 * is divisible by 3 and 5 fizzbuzz, 3 and 7, fizzbazz, 3,5,7, fizzbuzzbazz 
 */
package fizzbuzz;

/**
 *
 * @author visionaryJack/JohnWatts @date 2/12/2019
 */
import java.util.Scanner;

public class FizzBuzz {
    
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        String fizz = "Fizz", buzz = "Buzz", bazz = "Bazz"; //Strings for 3,5,7
	int iterTotal = 200;
        
        System.out.println("Please enter a integer to be iterated");
        if(userIn.hasNextInt()){ //catch exceptions, default input to 200 if non valid input
            iterTotal = userIn.nextInt();
        }else{
            System.out.println("This was not a integer, program will default to 200");
        }

        System.out.println("\nNumber entered is: "+ iterTotal +"\n");
        
	for (int i = 1; i <= iterTotal; i++)
	{
            if (i % 105 == 0) //if divisble by 105, then divisible by 3 and 5 and 7
            {   
                assert (i % 105 == 0) : "Iteration is not divisible by 105, there for is not divisible by 3 and 5 and 7.";
                System.out.println(fizz + buzz + bazz);
            }
            else if (i % 21  == 0) //if divisible by 21, then divisible by 3 and 7 
            {
                System.out.println(fizz + bazz); 
            }
            else if (i % 15  == 0) // if divisible by 15, then divisible by 3 and 5
            {
                System.out.println(fizz + buzz); 
            }
            else if (i % 3  == 0) // if divisible by 3
            {
                System.out.println(fizz);
            }
            else if (i % 5 == 0) // if divisible by 5
            {
                System.out.println(buzz);
            }
            else if (i % 7 == 0) // if divisible by 7
            {
                System.out.println(bazz);
            }
            else
            {
                System.out.println(""+i);
            }
	}
    }
}
