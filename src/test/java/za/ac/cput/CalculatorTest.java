package za.ac.cput;

import org.junit.*;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calc;

    @Before
    public void setUp() throws Exception {

        calc = new Calculator();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void add() {

        int c = calc.add(5,3);
        Assert.assertEquals("Answer",8,c);
    }

    @Test
    public void subtract() {
        int x = calc.subtract(2,2);
        Assert.assertEquals(0,x);
    }

    @Test
    public void multiply() {
    }

    @Test
    public void divide() {
    }
}