package test.chapter2;

import junit.framework.Assert;
import main.chapter2.FindNthToLastElementInLinkedList;
import main.chapter2.FindNthToLastElementInLinkedList.Node;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: cponakan
 * Date: 7/1/13
 * Time: 11:57 PM
 * To change this template use File | Settings | File Templates.
 */
public class FindNthToLastElementInLinkedListTest {
    FindNthToLastElementInLinkedList findNthToLastElementInLinkedListTest = new FindNthToLastElementInLinkedList();

    @Test
    public void testFindNthToLastElement() throws Exception {
        int[] array = {1,2,4,5,6,7,8,9,45};
        Node n =findNthToLastElementInLinkedListTest.createLinkedList(array);
        n =findNthToLastElementInLinkedListTest.findNthToLastElement(n, 3);
        Assert.assertEquals(8, n.getData());

    }
}
