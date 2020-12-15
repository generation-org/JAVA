package calculator.tdd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTDDTest
{


    CalculatorTDD calculatorTDD = new CalculatorTDD();

    @Test
    public void addTest()
    {
        assertEquals( 7, calculatorTDD.addNumbers( 5, 3 ) );
    }


    @Test
    public void subtractTest()
    {
        assertEquals( 5, calculatorTDD.subtractNumbers( 10, 5 ) );
    }


    @Test
    public void multiplyTest()
    {
        assertEquals( 15, calculatorTDD.multiplyNumbers( 5, 3 ) );
    }


    @Test
    public void divideTest()
    {
        assertEquals( 7, calculatorTDD.divideNumbers( 5, 0 ) );
    }
}
