package test.chapter1;

import main.chapter1.TwoStringsAnagrams;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class TwoStringsAnagramsTest {
     TwoStringsAnagrams twoStringsAnagrams = new TwoStringsAnagrams();

    @Test
    public void testWhenBothStringsAreNull() throws Exception {
        assertTrue(twoStringsAnagrams.isTwoStringsAnagrams(null, null));
    }

    @Test
    public void testWhenBothStringsAreAnagrams() throws Exception {
        assertTrue(twoStringsAnagrams.isTwoStringsAnagrams("abac", "cbaa"));
    }

    @Test
    public void testWhenBothStringsAreNotAnagrams() throws Exception {
        assertFalse(twoStringsAnagrams.isTwoStringsAnagrams("asdas", "redft"));
    }

    @Test
    public void testWhenOneStringsIsNull() throws Exception {
        assertFalse(twoStringsAnagrams.isTwoStringsAnagrams("sadasd", null));
    }
}
