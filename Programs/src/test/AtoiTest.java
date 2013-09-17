package test;

import main.Atoi;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class AtoiTest {
    private Atoi atoi = new Atoi();

    @Test
    public void testNegativeNumber(){
        int number = atoi.convertStringToInteger("-1234");
        assertEquals(-1234, number);
    }

    @Test
    public void testPositiveNumber(){
        int number = atoi.convertStringToInteger("1234");
        assertEquals(1234, number);
    }
}
