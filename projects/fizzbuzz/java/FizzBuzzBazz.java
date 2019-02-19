package Project2;
import java.util.Scanner;

public class FizzBuzzBazz {
	public static void ensurePositive(int n) throws IllegalArgumentException {
		if (n < 0) {
			throw new IllegalArgumentException("It's not a positive integer.");
		}
	}
	public static void main(String[] args) {
		int in = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer greater that 1");
		try {
			in = Integer.parseInt(input.next());
			ensurePositive(in);
		}
		catch(NumberFormatException e){
			in = 0;
			System.out.println("The number inputed was not an integer");
		}
		catch(IllegalArgumentException e){
			in = 0;
			System.out.println("The number inputed was not an integer greater than 1");
		}

		input.close();
		for (int i= 1; i < in+1; i++) {
			if(i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
				System.out.println(i);
			}
			else{
				StringBuilder sb = new StringBuilder();

				if(i % 3 == 0){
					sb.append("Fizz");
				}
				if(i % 5 == 0) {
					sb.append("Buzz");
				}
				if(i % 7 == 0) {
					sb.append("Bazz");
				}
				System.out.println(sb);
			}
		}
	}
}
