package test.chapter1;

import junit.framework.Assert;
import main.chapter1.RemoveDuplicateChars;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: cponakan
 * Date: 6/26/13
 * Time: 3:44 PM
 * To change this template use File | Settings | File Templates.
 */
public class RemoveDuplicateCharsTest {
    RemoveDuplicateChars removeDuplicateChars = new RemoveDuplicateChars();

    @Test
    public void testRemoveDuplicates() throws Exception {
        char[] array = {'a','s','a','d','a'};
        char[] s = removeDuplicateChars.removeDuplicates(array);
        char[] expectedarray = {'a', 's', 'd'};
        Assert.assertEquals(new String(expectedarray).toString(), new String(s).toString().trim());
    }

    @Test
    public void testNullValue() throws Exception {
        char[] s = removeDuplicateChars.removeDuplicates(null);
        Assert.assertNull(s);
    }

    @Test
    public void testRemoveDuplicatesWhenNoDuplicates() throws Exception {
        char[] array = {'a','b', 'c'};
        char[] s = removeDuplicateChars.removeDuplicates(array);
        Assert.assertEquals(new String(array).toString(), new String(s).toString().trim());
    }
}
