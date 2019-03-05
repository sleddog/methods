import java.util.Scanner;

public class CombinedJava {
    public static void main(String[] args) {
        boolean done = false;
        while(!done){
            try {
                Scanner in = new Scanner(System.in);
                System.out.println("Give me an n > 0 (no decimals). To make it interesting make it greater that 3...");
                System.out.println("If your done type in 0 to exit");
                int n = in.nextInt();

                if(n<0){
                    //useful error message
                    throw new ArithmeticException("That's not a valid number!");
                } else if(n == 0){
                    //finish the program upon request
                    done = true;
                }
                else{
                    //the meat
                    result(n);
                }
            }//say that an error occured
            catch(Exception e){
                System.out.println("Well that didn't work. Try something else!");
                System.out.println("Error caught: " + e + "\n");
            }
        }
    }

    public static void result(int num) {

        for (int i = 1; i <= num; i++) {
            System.out.println(calculate(i));
        }
    }

    public static String calculate(int val) {
        String print = "";
        if (val % 3 == 0) {
            print = print.concat("Fizz");
        }
        if (val % 5 == 0) {
            print = print.concat("Buzz");
        }
        if (val % 7 == 0) {
            print = print.concat("Bazz");
        }
        if ("".equals(print)) {
            print = String.valueOf(val);
        }
         return print;
    }
}
