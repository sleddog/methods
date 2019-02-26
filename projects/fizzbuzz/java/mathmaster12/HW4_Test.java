import static org.junit.Assert.*;

import org.junit.*;

public class HW4_Test {
	
	Homework4 home = new Homework4();

	@Test
	public void test() {
		assertEquals("default", Homework4.FizzBuzz(2));
	}
	@Test
	public void test2() {
		assertEquals("Fizz", Homework4.FizzBuzz(9));
	}
	@Test
	public void test3() {
		assertEquals("Buzz", Homework4.FizzBuzz(25));
	}
	@Test
	public void test4() {
		assertEquals("Bazz", Homework4.FizzBuzz(49));
	}
}
