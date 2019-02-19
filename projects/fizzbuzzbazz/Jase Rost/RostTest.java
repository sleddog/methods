import org.junit.ComparisonFailure;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class RostTest {

    public static void main(String[] args) {
        RostTest test = new RostTest();
        test.result(Integer.valueOf(args[0]));
    }

    @Test
    public void result(int cap) {
        ArrayList<String> test = Rost.result(cap);
        try {
            for (String line : test) {
                int num = test.indexOf(line) + 1;
                if (num % 3 == 0 && num % 5 == 0 && num % 7 == 0) {
                    assertEquals("FizzBuzzBazz", line);
                } else if (num % 3 == 0 && num % 5 == 0) {
                    assertEquals("FizzBuzz", line);
                } else if (num % 3 == 0 && num % 7 == 0) {
                    assertEquals("FizzBazz", line);
                } else if (num % 5 == 0 && num % 7 == 0) {
                    assertEquals("BuzzBazz", line);
                } else if (num % 3 == 0) {
                    assertEquals("Fizz", line);
                } else if (num % 5 == 0) {
                    assertEquals("Buzz", line);
                } else if (num % 7 == 0) {
                    assertEquals("Bazz", line);
                } else {
                    assertEquals(String.valueOf(num), line);
                }
            }
        } catch (ComparisonFailure e) {
            System.out.printf("Test failed: %s\n", e);
            return;
        }
        System.out.println("Test passed");
    }
}