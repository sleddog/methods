import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzBazzTest {

    @Test
    void testFizzBuzzBazz210(){
        ArrayList<Integer> fizzBuzzBazz = new ArrayList<Integer>();
        ByteArrayInputStream in = new ByteArrayInputStream("210".getBytes());
        System.setIn(in);
        fizzBuzzBazz = getArrList(210);
        assertEquals(fizzBuzzBazz, FizzBuzzBazz.fizzBuzzBazz());
    }

    @Test
    void testFizzBuzzBazz35(){
        ArrayList<Integer> fizzBuzzBazz = new ArrayList<Integer>();
        ByteArrayInputStream in = new ByteArrayInputStream("35".getBytes());
        System.setIn(in);
        fizzBuzzBazz = getArrList(35);
        assertEquals(fizzBuzzBazz, FizzBuzzBazz.fizzBuzzBazz());

    }

    @Test
    void testFizzBuzzBazzInvalidInput(){
        ArrayList<Integer> fizzBuzzBazz = new ArrayList<Integer>();
        ByteArrayInputStream in = new ByteArrayInputStream("a".getBytes());
        System.setIn(in);
        Exception e = assertThrows(NumberFormatException.class, () -> {FizzBuzzBazz.fizzBuzzBazz(); });
        assertEquals("Non-number entered:", e.getMessage());

    }

    @Test
    void testFizzBuzzBazzNoInput(){
        ArrayList<Integer> fizzBuzzBazz = new ArrayList<Integer>();
        ByteArrayInputStream in = new ByteArrayInputStream("\n".getBytes());
        System.setIn(in);
        Exception e = assertThrows(IllegalArgumentException.class, () -> {FizzBuzzBazz.fizzBuzzBazz(); });
        assertEquals("Error no number entered", e.getMessage());
    }


    private ArrayList<Integer> getArrList(int in){
        ArrayList<Integer> fizzBuzzBazz = new ArrayList<Integer>();
        for(int i=1; i<=in;i++){
            if(i%3==0){
                if(i%5==0){
                    if(i%7==0){
                        fizzBuzzBazz.add(-7); //Add fizz Buzz Bazz
                    }
                    fizzBuzzBazz.add(-4); //Add fizz Buzz
                }else if(i%7==0){
                    fizzBuzzBazz.add(-6); //Add fizz Bazz
                }else{
                    fizzBuzzBazz.add(-1); //Add "fizz"
                }
            }else if(i%5==0){
                if(i%7==0){
                    fizzBuzzBazz.add(-5); //Add Buzz Bazz
                }else {
                    fizzBuzzBazz.add(-2); //Add Buzz
                }
            }else if(i%7==0){
                fizzBuzzBazz.add(-3); //Add Bazz
            }else{
                fizzBuzzBazz.add(i); //Add i
            }
        }
        return fizzBuzzBazz;
    }
}