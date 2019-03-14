import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

// Done: Add unit tests that validate the function behaves as expected

//all options in test case form
public class TestSuite{

    Game game = new Game();
    //non multiple test
    @Test
    public void intLineTest(){
        assertEquals("4", game.out(4));
    }

    //just one multiple tests
    @Test
    public void fizzLineTest(){
        assertEquals("Fizz", game.out(9));
    }

    @Test
    public void buzzLineTest(){
        assertEquals("Buzz", game.out(10));
    }

    @Test
    public void bazzLineTest(){
        assertEquals("Bazz", game.out(14));
    }

    //two multiple tests
    @Test
    public void fizzBuzzLineTest(){
        assertEquals("FizzBuzz", game.out(15));
    }

    @Test
    public void fizzBazzLineTest(){
        assertEquals("FizzBazz", game.out(21));
    }

    @Test
    public void buzzBazzLineTest(){
        assertEquals("BuzzBazz", game.out(35));
    }

    //all multiple test
    @Test
    public void fizBuzzBazzLineTest(){
        assertEquals("FizzBuzzBazz", game.out(105));
    }
}

class TestRunner{
    public static void main (String[] args){
        Result result = JUnitCore.runClasses(TestSuite.class);

        for(Failure fail : result.getFailures()){
            System.out.println(fail.toString());
            System.out.println();
        }

        System.out.println(result.wasSuccessful());
    }
}