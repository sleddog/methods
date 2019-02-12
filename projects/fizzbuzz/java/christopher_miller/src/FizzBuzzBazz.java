import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Christopher Miller
MSU 1/28/19
 */
public class FizzBuzzBazz {

    public static ArrayList<Integer> fizzBuzzBazz(){
        ArrayList<Integer> fizz = new ArrayList<Integer>();
        int loopNumber;
        System.out.println("Enter a whole number:");
        //Create buffered reader in try catch so buffered reader auto closes.
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            String n = reader.readLine();
            //Incorrect input error handling.
            if(n.length() > 0) {
                try {
                    loopNumber = Integer.parseInt(n);
                }catch(NumberFormatException NM){
                    System.out.println("Non-number entered:");
                    System.out.println(NM.toString());
                    throw new NumberFormatException("Non-number entered:");
                }
            }else{
                System.out.println("Error no number entered");
                throw new IllegalArgumentException("Error no number entered");
            }
            //Loop to number entered by user print fizz if a number is divisible by 3 or buzz if it is divisible
            //by 5.
            for(int i=1;i<=loopNumber;i++){
                if(i%3==0){
                    System.out.print("Fizz");
                    if(i%5==0){
                        System.out.print(" Buzz");
                        if(i%7==0){
                            System.out.print(" Bazz");
                            fizz.add(-7); //Add fizz Buzz Bazz
                        }
                        fizz.add(-4); //Add fizz Buzz
                    }else if(i%7==0){
                        System.out.print(" Bazz");
                        fizz.add(-6); //Add fizz Bazz
                    }else{
                        fizz.add(-1); //Add "fizz"
                    }
                    System.out.println();
                }else if(i%5==0){
                    System.out.print("Buzz");
                    if(i%7==0){
                        System.out.print(" Bazz");
                        fizz.add(-5); //Add Buzz Bazz
                    }else {
                        fizz.add(-2); //Add Buzz
                    }
                    System.out.println();
                }else if(i%7==0){
                    System.out.println("Bazz");
                    fizz.add(-3); //Add Bazz
                }else{
                    System.out.println(i);
                    fizz.add(i); //Add i
                }
            }
        }catch(IOException io){
            System.out.println("Error with Buffered Reader");
            System.exit(2);
        }
        return fizz;
    }
}

