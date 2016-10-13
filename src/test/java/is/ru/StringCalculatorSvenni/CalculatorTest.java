package is.ru.StringCalculatorSvenni;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

public class CalculatorTest{

    @Test
    public void testEmptyString(){

        assertEquals(0, Calculator.add(""));
    }

    @Test
    public void testOneNumber(){

        assertEquals(1, Calculator.add("1"));
    }

    @Test
    public void testTwoNumbers(){

        assertEquals(3, Calculator.add("1,2"));
    }

    @Test
    public void testUnknownNumnberOfNumbers(){

        assertEquals(26, Calculator.add("1,2,4,8,5,6"));
    }
    @Test
    public void testNewLineDelimiter(){

        assertEquals(6, Calculator.add("1\n2,3"));
    }
    @Test
    public void testBiggerNumber(){

        assertEquals(2, Calculator.add("1001,2"));
    }

    @Rule
    public ExpectedException expectedEx = ExpectedException.none();

    @Test
    public void shouldThrowRuntimeExceptionNegativesAreIncluded() throws Exception {
        expectedEx.expect(RuntimeException.class);
        expectedEx.expectMessage("Negatives not allowed: -4,-5");
        Calculator.add("2,-4,3,-5");
    }

    @Test
    public void testCustomDelimiter(){

        assertEquals(3, Calculator.add("//;\n1;2"));
    }


}
