package test.chapter1;

import junit.framework.Assert;
import main.chapter1.IsRotationOfAnotherString;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: cponakan
 * Date: 7/1/13
 * Time: 10:44 PM
 * To change this template use File | Settings | File Templates.
 */
public class IsRotationOfAnotherStringTest {
    IsRotationOfAnotherString isRotationOfAnotherString = new IsRotationOfAnotherString();
    @Test
    public void testIsRotationOfAnotherString() throws Exception {
        Assert.assertEquals(true, isRotationOfAnotherString.isRotationOfAnotherString("waterbottle", "erbottlewat"));
    }

    @Test
    public void testIsRotationOfAnotherStringWhenNotRotation() throws Exception {
        Assert.assertEquals(false, isRotationOfAnotherString.isRotationOfAnotherString("awterbottle", "erbottlewat"));

    }

}
