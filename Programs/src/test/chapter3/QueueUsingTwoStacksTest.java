package test.chapter3;

import junit.framework.Assert;
import main.chapter3.QueueUsingTwoStacks;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: cponakan
 * Date: 7/9/13
 * Time: 2:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class QueueUsingTwoStacksTest {
    @Test
    public void testQueue() throws Exception {
        QueueUsingTwoStacks queueUsingTwoStacks = new QueueUsingTwoStacks();
        queueUsingTwoStacks.enQueue(1);
        queueUsingTwoStacks.enQueue(2);
        queueUsingTwoStacks.enQueue(3);
        queueUsingTwoStacks.enQueue(4);
        Assert.assertEquals(1, queueUsingTwoStacks.deQueue());
        queueUsingTwoStacks.enQueue(6);
        Assert.assertEquals(2, queueUsingTwoStacks.deQueue());
        Assert.assertEquals(3, queueUsingTwoStacks.deQueue());
        Assert.assertEquals(4, queueUsingTwoStacks.deQueue());
        Assert.assertEquals(6, queueUsingTwoStacks.deQueue());


    }
}
