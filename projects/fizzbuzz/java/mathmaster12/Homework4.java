//Homework 4


import java.util.Scanner;
import java.util.InputMismatchException;

public class Homework4 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);  
		System.out.println("Enter a number: ");
        try {
            int n = reader.nextInt();
            FizzBuzz(n);
        } catch (InputMismatchException e) { //check for incorrect input
            System.out.println("Invalid entry.");
        }
		reader.close();
	}
	
	public static String FizzBuzz(int n){
		String check = "default";
		System.out.println("");
		System.out.println("w/ n = "+n);
		System.out.println();
		int i = n;
		int j = 1;
		do{
			if(j%3 == 0){ //check if # is divisible by 3
				System.out.print("Fizz");	
				check = "Fizz";
			}
			if(j%5 == 0){ //check if # is divisible by 5
				System.out.print("Buzz");
				check = "Buzz";
			}
			if(j%7 == 0){ //check if # is divisible by 7
				System.out.print("Bazz");
				check = "Bazz";
			}
			if (j%3 != 0 && j%5 != 0 && j%7 != 0){ //print all other #
				System.out.print(j);
			}
			++j;
			--i;
			System.out.println("");
		}while(i > 0);
		return check;
	}
}
