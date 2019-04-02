package fizzbuzz;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;

public class FizzBuzzTest
{

    @BeforeAll
    public static void setUpClass() throws Exception {
    }

    @AfterAll
    public static void tearDownClass() throws Exception {
    }
    @Test
    public void testFizz()
    {
        int amount = 3;
        String expResult = "Fizz";
        String result = FizzBuzz.Printing(amount);
        assertTrue (expResult.equals(result));
        fail ("Fizz did not print");
    }
    @Test
    public void testBazz()
    {
        int amount = 5;
        String expResult = "Bazz";
        String result = FizzBuzz.Printing(amount);
        assertTrue (expResult.equals(result));
        fail ("Bazz did not print");
    }
    @Test
    public void testBuzz()
    {
        int amount = 7;
        String expResult = "Buzz";
        String result = FizzBuzz.Printing(amount);
        assertTrue (expResult.equals(result));
        fail ("Buzz did not print");
    }
    @Test
    public void testFizzBazz()
    {
        int amount = 15;
        String expResult = "FizzBazz";
        String result = FizzBuzz.Printing(amount);
        assertTrue (expResult.equals(result));
        fail ("FizzBazz did not print");
    }
    @Test
    public void testFizzBuzz()
    {
        int amount = 21;
        String expResult = "FizzBuzz";
        String result = FizzBuzz.Printing(amount);
        assertTrue (expResult.equals(result));
        fail ("FizzBuzz did not print");
    }
    @Test
    public void testBazzBuzz()
    {
        int amount = 35;
        String expResult = "Fizz";
        String result = FizzBuzz.Printing(amount);
        assertTrue (expResult.equals(result));
        fail ("BazzBuzz did not print");
    }
    @Test
    public void testFizzBazzBuzz()
    {
        int amount = 105;
        String expResult = "FizzBazzBuzz";
        String result = FizzBuzz.Printing(amount);
        assertTrue (expResult.equals(result));
        fail ("FizzBazzBuzz did not print");
    }
    @Test
    public void testOtherNumber()
    {
        int amount = 2;
        String expResult = "2";
        String result = FizzBuzz.Printing(amount);
        assertTrue (expResult.equals(result));
        fail ("2 did not print");
    }

    /**
     * Test of main method, of class FizzBuzz.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        FizzBuzz.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Printing method, of class FizzBuzz.
     */
//    @Test
//    public void testPrinting() {
//        System.out.println("Printing");
//        int amount = 0;
//        String expResult = "";
//        String result = FizzBuzz.Printing(amount);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
}
