package test.chapter1;

import main.chapter1.StringHasUniqueChars;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;


public class StringHasUniqueCharsTest {
    StringHasUniqueChars  stringHasUniqueChars = new StringHasUniqueChars();

    @Test
    public void testWhenStringIsNotUnique()  {
        boolean val = stringHasUniqueChars.isAllUniqueCharacters("reererer");
        assertEquals(false, val);
    }

    @Test
    public void testWhenStringIsUnique()  {
        boolean val = stringHasUniqueChars.isAllUniqueCharacters("charit");
        assertEquals(true, val);
    }

    @Test
    public void testWhenStringIsUniqueAndAllSmallLetters()  {
        boolean val = stringHasUniqueChars.isAllUniqueCharsIfStringIsInAllSmallLetters("bdef");
        assertEquals(true, val);
    }

    @Test
    public void testWhenStringIsNotUniqueAndAllSmallLetters()  {
        boolean val = stringHasUniqueChars.isAllUniqueCharsIfStringIsInAllSmallLetters("bfg2311def");
        assertEquals(false, val);
    }
}
