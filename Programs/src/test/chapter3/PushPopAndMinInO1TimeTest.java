package test.chapter3;

import junit.framework.Assert;
import main.chapter3.PushPopAndMinInO1Time;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: cponakan
 * Date: 7/9/13
 * Time: 1:53 PM
 * To change this template use File | Settings | File Templates.
 */
public class PushPopAndMinInO1TimeTest {
    @Test
    public void testPushPopAndMin() throws Exception {
        int[] array = {1,2,4,6,7,9};
        PushPopAndMinInO1Time pushPopAndMinInO1Time = new PushPopAndMinInO1Time();
        pushPopAndMinInO1Time.push(1);
        pushPopAndMinInO1Time.push(2);
        Assert.assertEquals(1, pushPopAndMinInO1Time.min());
        Assert.assertEquals(2, pushPopAndMinInO1Time.pop().getData());
        Assert.assertEquals(1, pushPopAndMinInO1Time.pop().getData());
        pushPopAndMinInO1Time.push(8);
        pushPopAndMinInO1Time.push(7);
        pushPopAndMinInO1Time.push(9);
        Assert.assertEquals(7, pushPopAndMinInO1Time.min());
        Assert.assertEquals(9, pushPopAndMinInO1Time.pop().getData());
        Assert.assertEquals(7, pushPopAndMinInO1Time.min());
        Assert.assertEquals(7, pushPopAndMinInO1Time.pop().getData());
        Assert.assertEquals(8, pushPopAndMinInO1Time.min());

    }

}
