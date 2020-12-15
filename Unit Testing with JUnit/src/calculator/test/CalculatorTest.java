package calculator.test;

import calculator.model.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest
{

    Calculator calculator = new Calculator();

    @Test
    public void addTest()
    {
        assertEquals( 7, calculator.addNumbers( 5, 3 ) );
    }


    @Test
    public void subtractTest()
    {
        assertEquals( 5, calculator.subtractNumbers( 10, 5 ) );
    }


    @Test
    public void multiplyTest()
    {
        assertEquals( 15, calculator.multiplyNumbers( 5, 3 ) );
    }


    @Test
    public void divideTest()
    {
        assertEquals( 7, calculator.divideNumbers( 5, 0 ) );
    }


}
