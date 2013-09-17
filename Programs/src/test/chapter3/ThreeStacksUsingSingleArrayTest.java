package test.chapter3;

import junit.framework.Assert;
import main.chapter3.ThreeStacksUsingSingleArray;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: cponakan
 * Date: 7/22/13
 * Time: 11:41 AM
 * To change this template use File | Settings | File Templates.
 */
public class ThreeStacksUsingSingleArrayTest {
    ThreeStacksUsingSingleArray threeStacksUsingSingleArray = new ThreeStacksUsingSingleArray();

    @Test
    public void testPushPopAndISEmptyOfFirstStack() throws Exception {
        Assert.assertTrue(threeStacksUsingSingleArray.isEmpty(0));
        threeStacksUsingSingleArray.push(0, 25);
        threeStacksUsingSingleArray.push(0,34);
        threeStacksUsingSingleArray.push(0,45);
        threeStacksUsingSingleArray.push(0,23);
        threeStacksUsingSingleArray.push(0,54);
        Assert.assertEquals(54, threeStacksUsingSingleArray.pop(0));
        Assert.assertEquals(23, threeStacksUsingSingleArray.pop(0));
        Assert.assertEquals(45, threeStacksUsingSingleArray.pop(0));
        Assert.assertFalse(threeStacksUsingSingleArray.isEmpty(0));

        Assert.assertEquals(34, threeStacksUsingSingleArray.pop(0));
        Assert.assertEquals(25, threeStacksUsingSingleArray.pop(0));
        Assert.assertTrue(threeStacksUsingSingleArray.isEmpty(0));



    }
}
