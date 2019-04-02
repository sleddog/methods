package CombinedJava;

import CombinedJava.CombinedJava;
import org.junit.*;

import static org.junit.Assert.*;

public class CombinedJavaTest {

    @Test
    public void calculate_test_fizz(){
        String answer = "Fizz";
        CombinedJava tester = new CombinedJava();
        assertEquals(answer, tester.calculate(6));
    }

    @Test
    public void calculate_test_buzz(){
        String answer = "Buzz";
        CombinedJava tester = new CombinedJava();
        assertEquals(answer, tester.calculate(20));
    }

    @Test
    public void calculate_test_bazz(){
        String answer = "Bazz";
        CombinedJava tester = new CombinedJava();
        assertEquals(answer, tester.calculate(28));
    }

    @Test
    public void calculate_test_fizzbuzz(){
        String answer = "FizzBuzz";
        CombinedJava tester = new CombinedJava();
        assertEquals(answer, tester.calculate(15));
    }

    @Test
    public void calculate_test_fizzbazz(){
        String answer = "FizzBazz";
        CombinedJava tester = new CombinedJava();
        assertEquals(answer, tester.calculate(21));
    }

    @Test
    public void calculate_test_buzzbazz(){
        String answer = "BuzzBazz";
        CombinedJava tester = new CombinedJava();
        assertEquals(answer, tester.calculate(35));
    }

    @Test
    public void calculate_test_fizzbuzzbazz(){
        String answer = "FizzBuzzBazz";
        CombinedJava tester = new CombinedJava();
        assertEquals(answer, tester.calculate(105));
    }

}