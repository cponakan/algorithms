package test.chapter3;

import junit.framework.Assert;
import main.chapter3.SetOfStacks;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: cponakan
 * Date: 7/22/13
 * Time: 2:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class SetOfStacksTest {
    @Test
    public void testSetOfStacks(){
        SetOfStacks setOfStacks = new SetOfStacks(3);
        setOfStacks.push(3);
        setOfStacks.push(4);
        setOfStacks.push(5);
        setOfStacks.push(6);
        Assert.assertEquals(6, setOfStacks.pop());
        Assert.assertEquals(5, setOfStacks.pop());
        Assert.assertEquals(4, setOfStacks.pop());
        Assert.assertEquals(3, setOfStacks.pop());

    }
}
