import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
Christopher Miller
MSU 1/28/19
 */
public class Main {

    public static void main(String[] args){
        System.out.println("Enter a whole number:");
        int loopNumber;
        //Create buffered reader in try catch so buffered reader auto closes.
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            String n = reader.readLine();
            loopNumber = Integer.parseInt(n);
            //Loop to number entered by user print fizz if a number is divisible by 3 or buzz if it is divisible
            //by 5.
            for(int i=1;i<=loopNumber;i++){
                if(i%3==0){

                    if(i%5==0){
                        System.out.print("Fizz");
                        System.out.println("Buzz");
                    }else{
                        System.out.println("Fizz");
                    }
                }else if(i%5==0){
                    System.out.println("Buzz");
                }else{
                    System.out.println(i);
                }
            }
        }catch(IOException io){

        }
    }
}
