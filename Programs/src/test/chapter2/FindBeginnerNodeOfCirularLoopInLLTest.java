package test.chapter2;

import junit.framework.Assert;
import main.chapter2.FindBeginnerNodeOfCirularLoopInLL;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: cponakan
 * Date: 7/8/13
 * Time: 12:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class FindBeginnerNodeOfCirularLoopInLLTest {
    FindBeginnerNodeOfCirularLoopInLL findBeginnerNodeOfCirularLoopInLL = new FindBeginnerNodeOfCirularLoopInLL();
    @Test
    public void testFindBeginningOfLoop() throws Exception {
        int[] array1 = {1,2,4,5,6,8,9};
        FindBeginnerNodeOfCirularLoopInLL.Node n1 = findBeginnerNodeOfCirularLoopInLL.createCircularLinkedList(array1, 3);
        FindBeginnerNodeOfCirularLoopInLL.Node node = findBeginnerNodeOfCirularLoopInLL.findBeginningOfLoop(n1);
        Assert.assertEquals(findBeginnerNodeOfCirularLoopInLL.getNthNode(), node);
        Assert.assertEquals(5, node.getData());
    }

    @Test
    public void testFindBeginningOfLoop2() throws Exception {
        int[] array2 = {5,7,8,6,3,1,0};
        FindBeginnerNodeOfCirularLoopInLL.Node n1 = findBeginnerNodeOfCirularLoopInLL.createCircularLinkedList(array2, 3);
        FindBeginnerNodeOfCirularLoopInLL.Node node = findBeginnerNodeOfCirularLoopInLL.findBeginningOfLoop(n1);
        Assert.assertEquals(findBeginnerNodeOfCirularLoopInLL.getNthNode(), node);
        Assert.assertEquals(6, node.getData());
    }
}
