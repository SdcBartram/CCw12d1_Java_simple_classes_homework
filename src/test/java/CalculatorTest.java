import com.codeclan.example.Calculator;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void before() {calculator = new Calculator();}

    @Test
    public void canAdd() {assertEquals(4,calculator.add(2,2));}

    @Test
    public void canSubtract() {assertEquals(1,calculator.subtract(5,4));}

    @Test
    public void canMultiply() {assertEquals(6,calculator.multiply(2,3));}

    @Test
    public void canDivide() {assertEquals(6,calculator.divide(12,2),0.0);}
}
