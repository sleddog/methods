package fizzbuzz;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Please enter a number: ");
            int inp = Integer.parseInt(reader.readLine()); //record users answer

            fizzbuzz(inp);
        } catch (Exception e) {
            System.out.println("EXCEPTION: Lemme guess, you didn't type a number? Typical user."); //Likely end to my career in professional setting
        }
    }

    public static String fizzbuzz(int n){
        int i = 1;
        while (i <= n) {
            if (i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
                System.out.print(i);
            } else {
                if (i % 3 == 0) {
                    System.out.print("Fizz");
                }
                if (i % 5 == 0) {
                    System.out.print("Buzz");
                }
                if (i % 7 == 0) {
                    System.out.print("Bazz");
                }
            }
            System.out.println(); //formatting
            i++;
        }
        // TESTING
        String test = "";
        if (n % 3 != 0 && n % 5 != 0 && n % 7 != 0) {
            test = test.concat("Not FizzBuzzBazz");
        } else {
            if (n % 3 == 0) {
                test = test.concat("Fizz");
            }
            if (n % 5 == 0) {
                test = test.concat("Buzz");
            }
            if (n % 7 == 0) {
                test = test.concat("Bazz");
            }
        }
        return test;
    }
}
