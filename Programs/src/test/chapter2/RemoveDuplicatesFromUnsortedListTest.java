package test.chapter2;

import junit.framework.Assert;
import main.chapter2.RemoveDuplicatesFromUnsortedList;
import main.chapter2.RemoveDuplicatesFromUnsortedList.Node;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: cponakan
 * Date: 7/1/13
 * Time: 11:23 PM
 * To change this template use File | Settings | File Templates.
 */
public class RemoveDuplicatesFromUnsortedListTest {
    RemoveDuplicatesFromUnsortedList removeDuplicatesFromUnsortedList = new RemoveDuplicatesFromUnsortedList();

    @Test
    public void testRemoveDuplicates() throws Exception {
        int[] array = {1,2,4,2,5,6,7,6};
        Node n =removeDuplicatesFromUnsortedList.createLinkedList(array);
        n =removeDuplicatesFromUnsortedList.removeDuplicates(n);
        int[] outputarray = {1,2,4,5,6,7};
        int j = 0;
        while(n!=null){
            Assert.assertEquals(outputarray[j++], n.getData());
            n = n.getNextNode();
        }
    }

    @Test
    public void testRemoveDuplicatesWhenNoDuplicates() throws Exception {
        int[] array = {1,2,4,6,7,9};
        Node n =removeDuplicatesFromUnsortedList.createLinkedList(array);
        n =removeDuplicatesFromUnsortedList.removeDuplicates(n);
        int j = 0;
        while(n!=null){
            Assert.assertEquals(array[j++], n.getData());
            n = n.getNextNode();
        }

    }

    @Test
    public void removeDuplicatesWithoutBuffer() throws Exception {
        int[] array = {1,2,4,2,5,6,7,6};
        Node n =removeDuplicatesFromUnsortedList.createLinkedList(array);
        n =removeDuplicatesFromUnsortedList.removeDuplicatesWithoutBuffer(n);
        int[] outputarray = {1,2,4,5,6,7};
        int j = 0;
        while(n!=null){
            Assert.assertEquals(outputarray[j++], n.getData());
            n = n.getNextNode();
        }
    }

    @Test
    public void removeDuplicatesWithoutBufferWhenNoDuplicates() throws Exception {
        int[] array = {1,2,4,6,7,9};
        Node n =removeDuplicatesFromUnsortedList.createLinkedList(array);
        n =removeDuplicatesFromUnsortedList.removeDuplicatesWithoutBuffer(n);
        int j = 0;
        while(n!=null){
            Assert.assertEquals(array[j++], n.getData());
            n = n.getNextNode();
        }

    }
}
