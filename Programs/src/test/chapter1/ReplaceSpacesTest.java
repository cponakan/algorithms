package test.chapter1;

import junit.framework.Assert;
import main.chapter1.ReplaceSpaces;
import org.junit.Test;

public class ReplaceSpacesTest {
    ReplaceSpaces replaceSpaces = new ReplaceSpaces();

    @Test
    public void testReplaceSpaces() throws Exception {
        String s= replaceSpaces.replaceSpaces("sd t er");
        Assert.assertEquals("sd%20t%20er", s);
    }

    @Test
    public void testReplaceSpacesWhenNoSpaces() throws Exception {
        String s= replaceSpaces.replaceSpaces("sdr");
        Assert.assertEquals("sdr", s);
    }
}
