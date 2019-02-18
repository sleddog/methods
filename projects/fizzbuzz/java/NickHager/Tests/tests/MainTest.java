package tests;

import org.junit.Test;

import static fizzbuzz.Main.fizzbuzz;
import static org.junit.Assert.assertEquals;
import static org.testng.Assert.*;

public class MainTest {

    @org.junit.Test
    public void notfizzbuzz(){
        assertEquals("Not FizzBuzzBazz", fizzbuzz(1));
    }

    @org.junit.Test
    public void fizz(){
        assertEquals("Fizz", fizzbuzz(3));
    }

    @org.junit.Test
    public void buzz(){
        assertEquals("Buzz", fizzbuzz(5));
    }

    @Test
    public void bazz(){
        assertEquals("Bazz", fizzbuzz(7));
    }

    @Test
    public void fizzandbuzz(){
        assertEquals("FizzBuzz", fizzbuzz(15));
    }

    @Test
    public void fizzandbazz(){
        assertEquals("FizzBazz", fizzbuzz(21));
    }

    @Test
    public void buzzandbazz(){
        assertEquals("BuzzBazz", fizzbuzz(35));
    }

    @Test
    public void all(){
        assertEquals("FizzBuzzBazz", fizzbuzz(105));
    }

}