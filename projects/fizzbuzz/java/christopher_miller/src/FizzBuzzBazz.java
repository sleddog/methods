import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Christopher Miller
MSU 1/28/19
 */
public class FizzBuzzBazz {

    public static void main(String args[]){
        try{
            printFizz(fizzBuzzBazz());
        }catch (NumberFormatException NF){
            System.out.println(NF.getMessage());
        }catch (IllegalArgumentException IA){
            System.out.println(IA.getMessage());
        }
    }
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
                    if(loopNumber<1){
                        throw new NumberFormatException("Error: Number less than 1 entered");
                    }
                }catch(NumberFormatException NM){
                    throw new NumberFormatException("Error: Non-number entered");
                }
            }else{
                throw new IllegalArgumentException("Error: No number entered");
            }
            //Loop to number entered by user print fizz if a number is divisible by 3 or buzz if it is divisible
            //by 5.
            fizz= makeList(loopNumber);
        }catch(IOException io){
            System.out.println("Error with Buffered Reader");
            System.exit(2);
        }
        return fizz;
    }

    public static ArrayList<Integer> makeList(int loopNumber){
        ArrayList<Integer> fizz = new ArrayList<Integer>();
        //Loop to number entered by user print fizz if a number is divisible by 3 or buzz if it is divisible
        //by 5.
        for(int i=1;i<loopNumber+1;i++){
            if(i%3==0){
                if(i%5==0){
                    if(i%7==0){
                        fizz.add(-7); //Add fizz Buzz Bazz
                    }else {
                        fizz.add(-4); //Add fizz Buzz
                    }
                }else if(i%7==0){
                    fizz.add(-6); //Add fizz Bazz
                }else{
                    fizz.add(-1); //Add "fizz"
                }
            }else if(i%5==0){
                if(i%7==0){
                    fizz.add(-5); //Add Buzz Bazz
                }else {
                    fizz.add(-2); //Add Buzz
                }
            }else if(i%7==0){
                fizz.add(-3); //Add Bazz
            }else{
                fizz.add(i); //Add i
            }
        }
        return fizz;
    }

    private static void printFizz(ArrayList<Integer> fizzBuzz){
        for(int i: fizzBuzz){
            if(i>0){
                System.out.println(i);
            }else {
                switch (i) {
                    case (-1):
                        System.out.println("Fizz");
                        break;
                    case (-2):
                        System.out.println("Buzz");
                        break;
                    case (-3):
                        System.out.println("Bazz");
                        break;
                    case (-4):
                        System.out.println("Fizz Buzz");
                        break;
                    case (-5):
                        System.out.println("Buzz Bazz");
                        break;
                    case (-6):
                        System.out.println("Fizz Bazz");
                        break;
                    case (-7):
                        System.out.println("Fizz Buzz Bazz");
                        break;
                    default:
                        throw new NumberFormatException("Error: Number less than 1 encoutered in print");
                }
            }
        }
    }
}

