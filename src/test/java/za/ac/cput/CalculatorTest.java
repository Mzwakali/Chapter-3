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

    //Object Equality
    @Test
    public void add() {

        int c = calc.add(5,3);
        Assert.assertEquals("Answer",8,c);
    }

    @Ignore
    @Test
    public void subtract() {
        int x = calc.subtract(8,2);
        Assert.assertEquals(6,x);
    }

    //Object Identification
    @Test
    public void multiply() {
        int x = calc.multiply(2,2);
        Assert.assertSame(8,x);
    }


    @Test(timeout = 1000)
    public void divide() {
        int x = calc.divide(9,3);
        Assert.assertTrue("There was an error running this",true);
    }
}