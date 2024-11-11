import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class CalculatorTest {

    static Calculator calculator;
    @BeforeEach
    public void föreTester(){
        calculator= new Calculator();
    }

    @Test
    public void testAdd(){
        int actual = calculator.add(8,9);
        assertEquals(17,actual);
    }
    @Test
    public void negativTestAdd(){
        int actual = calculator.add(3,6);
        assertNotEquals(12,actual);
    }
    @org.junit.jupiter.api.Test
    public void testSubtract(){
        int actual = calculator.subtract(10,3);
        assertNotEquals(8,actual);

    }
    @org.junit.jupiter.api.Test
    public void testSubtractP(){
        int actual = calculator.subtract(10,3);
        assertEquals(7,actual);

    }

    @org.junit.jupiter.api.Test
    public void testMultiply(){
        int actual = calculator.multiply(8,2);
        assertNotEquals(15,actual);
    }
    @org.junit.jupiter.api.Test
    public void testMultiply2(){
        int actual = calculator.multiply(8,2);
        assertEquals(16,actual);
    }
    @org.junit.jupiter.api.Test
    public void testMultiply2_(){
        int actual = calculator.multiply(6,2);
        assertEquals(12,actual);
    }
    //emre


}
