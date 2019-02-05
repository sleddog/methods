package Project2;
import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer greater that 1");
		int in = Integer.parseInt(input.next());
		input.close();
		for (int i= 0; i < in; i++) {
			if(i % 3 != 0 && i % 5!=0) {
				System.out.println(i);
			}
			else{
				if(i % 3 == 0 && i % 5==0) {
					System.out.println("FizzBuzz");
				}
				else {
					if(i % 3==0){
						System.out.println("Fizz");
					}
					if(i%5==0) {
						System.out.println("Buzz");
					}
				}
			}
		}
	}
}
