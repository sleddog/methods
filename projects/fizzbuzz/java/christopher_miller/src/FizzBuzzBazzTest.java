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
        fizzBuzzBazz = FizzBuzzBazz.makeList(210);
        assertEquals(fizzBuzzBazz, FizzBuzzBazz.fizzBuzzBazz());
    }

    @Test
    void testFizzBuzzBazz35(){
        ArrayList<Integer> fizzBuzzBazz = new ArrayList<Integer>();
        ByteArrayInputStream in = new ByteArrayInputStream("35".getBytes());
        System.setIn(in);
        fizzBuzzBazz = FizzBuzzBazz.makeList(35);
        assertEquals(fizzBuzzBazz, FizzBuzzBazz.fizzBuzzBazz());

    }

    @Test
    void testFizzBuzzBazzInvalidInput(){
        ArrayList<Integer> fizzBuzzBazz = new ArrayList<Integer>();
        ByteArrayInputStream in = new ByteArrayInputStream("a".getBytes());
        System.setIn(in);
        Exception e = assertThrows(NumberFormatException.class, () -> {FizzBuzzBazz.fizzBuzzBazz(); });
        assertEquals("Error: Non-number entered", e.getMessage());

    }

    @Test
    void testFizzBuzzBazzNoInput(){
        ArrayList<Integer> fizzBuzzBazz = new ArrayList<Integer>();
        ByteArrayInputStream in = new ByteArrayInputStream("\n".getBytes());
        System.setIn(in);
        Exception e = assertThrows(IllegalArgumentException.class, () -> {FizzBuzzBazz.fizzBuzzBazz(); });
        assertEquals("Error: No number entered", e.getMessage());
    }

    @Test
    void testFizzBuzzBazzNegativeInput(){
        ArrayList<Integer> fizzBuzzBazz = new ArrayList<Integer>();
        ByteArrayInputStream in = new ByteArrayInputStream("-67".getBytes());
        System.setIn(in);
        Exception e = assertThrows(NumberFormatException.class, () -> {FizzBuzzBazz.fizzBuzzBazz(); });
        assertEquals("Error: Non-number entered", e.getMessage());
    }
}