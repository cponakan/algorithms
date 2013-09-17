package test;

import junit.framework.Assert;
import main.general.MinPointsInCurve;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: cponakan
 * Date: 7/19/13
 * Time: 11:41 AM
 * To change this template use File | Settings | File Templates.
 */
public class MinPointsInCurveTest {
    MinPointsInCurve  minPointsInCurve = new MinPointsInCurve();


    @Test
    public void testMinPointsIncreasingOrder(){
        int[] input = {1,2,3};
        int[] output =  minPointsInCurve.getMinPoints(input);
        Assert.assertEquals(1, output[0]);
    }

    @Test
    public void testMinPointsDecreasingOrder(){
        int[] input = {11,7,6};
        int[] output =  minPointsInCurve.getMinPoints(input);
        Assert.assertEquals(6, output[0]);
    }

    @Test
    public void testMinPointIncreasingAndDecreasingOrder(){
        int[] input = {11,12,3};
        int[] output =  minPointsInCurve.getMinPoints(input);
        Assert.assertEquals(11, output[0]);
        Assert.assertEquals( 3, output[1]);
    }

    @Test
    public void testMinPointDecreasingAndIncreasingOrder(){
        int[] input = {11,5,13};
        int[] output =  minPointsInCurve.getMinPoints(input);
        Assert.assertEquals(5, output[0]);
    }



}
