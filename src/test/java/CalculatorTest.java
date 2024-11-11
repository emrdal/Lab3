import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class CalculatorTest {

    static Calculator calculator;
    @Before
    public void föreTester(){
        calculator= new Calculator();
    }

    @Test


    public void testAdd(){
        int actual = calculator.add(8,9);
        Assert.assertEquals(17,actual);
    }
    @Test


    public void negativTestAdd(){
        int actual = calculator.add(3,6);
        Assert.assertNotEquals(12,actual);
    }
    @Test
    public void testSubtract(){
        int actual = calculator.subtract(10,3);
        Assert.assertNotEquals(8,actual);

    }
    @Test
    public void testSubtractP(){
        int actual = calculator.subtract(10,3);
        Assert.assertEquals(7,actual);

    }

    @Test
    public void testMultiply(){
        int actual = calculator.multiply(8,2);
        Assert.assertNotEquals(15,actual);
    }
    @Test
    public void testMultiply2(){
        int actual = calculator.multiply(8,2);
        Assert.assertEquals(16,actual);
    }


}
