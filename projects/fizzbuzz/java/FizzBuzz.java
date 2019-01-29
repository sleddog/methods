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
