package test.chapter2;

import junit.framework.Assert;
import main.chapter2.DeleteMiddleNodeInLL;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: cponakan
 * Date: 7/2/13
 * Time: 12:13 AM
 * To change this template use File | Settings | File Templates.
 */
public class DeleteMiddleNodeInLLTest {
    DeleteMiddleNodeInLL deleteMiddleNodeInLL = new DeleteMiddleNodeInLL();

    @Test
    public void testDeleteNode() throws Exception {
        int[] array = {1,2,4,5,6,7,8,9,45};
        DeleteMiddleNodeInLL.Node n =deleteMiddleNodeInLL.createLinkedList(array);
        n = n.getNextNode().getNextNode().getNextNode().getNextNode();
        Assert.assertEquals(true, deleteMiddleNodeInLL.deleteNode(n));

    }
}
