package fizzbuzz;
import java.util.Scanner;

public class FizzBuzz {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("Please Enter a number: ");
		int input = scan.nextInt();
		fizzBuzz(input);
	}

	/*
	The fizzBuzz method runs through the number printing on a new line each time.
	We start by testing if it's divisible by both 3 and 5, then we go through to see if it's
	divisible by either 3 or 5.
	*/
	public static void fizzBuzz(int n) {
		for(int i = 1; i <= n; i++)
		{	
			if((i % 3 == 0) && (i % 5 == 0))
				System.out.println("fizzbuzz");
			else if(i % 3 == 0)
				System.out.println("fizz");
			else if (i % 5 == 0)
				System.out.println("buzz");
			else 
				System.out.println(i);	
		}
	}

}
