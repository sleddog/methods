/*
 * This is a function to iterate 100 times, if the iteration
 * is divisible by 3 or 5, print Fizz, or Buzz respectivly, 
 * else print the number of the iteration starting at 1, ending at 100.
 */
package fizzbuzz;

/**
 *
 * @author visionaryJack
 */
public class FizzBuzz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String fizz = "Fizz"; //String for 3
	String buzz = "Buzz"; //String for 5
        
	for (int i = 1; i <= 100; i++)
	{
            if (i % 15 == 0) //if divisble by 15, then divisible by 3 and 5
            {
                System.out.println(fizz + buzz);
            }
            else if (i % 3  == 0)
            {
                System.out.println(fizz);
            }
            else if (i % 5 == 0)
            {
                System.out.println(buzz);
            }
            else
            {
                System.out.println(""+i);
            }
	}
    }
}
