import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Lab2JUnitTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void numberWithMaxQuantityBitIs1() {
        int n = 10;

        int expectedResult = 7;

        int result = com.company.Main.numberWithMaxQuantityBitIs1(n);

        assertEquals(expectedResult, result);
    }

    @Test
    public void primeNumbers() {
        int n =10;

        int[] expectedResult = mockArrayInt();

        int[] result = com.company.Main.PrimeNumbers(n);

        Assert.assertArrayEquals(expectedResult, result);
    }

    @Test
    public void quantityBitIs1() {
        int number = 27;
        int expectedResult = 4;

        int result = com.company.Main.QuantityBitIs1(number);

        assertEquals(expectedResult, result);
    }

    private int[] mockArrayInt()
    {
        int[] Numbers = {2, 3, 5, 7};

        return Numbers;
    }
}