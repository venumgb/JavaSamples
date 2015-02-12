package test.java.com.madhaviv;

import main.java.com.madhaviv.*;
import org.junit.*;
import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    int i = 3;
    int j = 15;
    int k = 10;
    @Test
    public void testPasses() {
        String expected = "Hello, JUnit!";
        String hello = "Hello, JUnit!";
        assertEquals(hello, expected);
    }
    @Test
    public void testMultipleofThreeAndFive()
    {

        assertEquals("FizzBuzz", FizzBuzz.print(j));
    }
    @Test
    public void testMultipleofThree()
    {
        assertEquals("Fizz",FizzBuzz.print(i));
    }
    @Test
    public void testMultipleofFive()
    {
        assertEquals("Buzz",FizzBuzz.print(k));
    }
}