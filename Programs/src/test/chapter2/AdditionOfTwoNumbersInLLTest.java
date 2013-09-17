package test.chapter2;

import junit.framework.Assert;
import main.chapter2.AdditionOfTwoNumbersInLL;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: cponakan
 * Date: 7/3/13
 * Time: 11:43 AM
 * To change this template use File | Settings | File Templates.
 */
public class AdditionOfTwoNumbersInLLTest {
    AdditionOfTwoNumbersInLL additionOfTwoNumbersInLL = new AdditionOfTwoNumbersInLL();

    @Test
    public void testAdd() throws Exception {
        int[] array1 = {1,2,4,5,6,7,8,9};
        int[] array2 = {5,7,8,5,6,3,1,0};
        AdditionOfTwoNumbersInLL.Node n1 =additionOfTwoNumbersInLL.createLinkedList(array1);
        AdditionOfTwoNumbersInLL.Node n2 =additionOfTwoNumbersInLL.createLinkedList(array2);
        AdditionOfTwoNumbersInLL.Node result = additionOfTwoNumbersInLL.add(n1, n2);
        int[] array3 = {6,9,2,1,3,1,0,0,1};
        AdditionOfTwoNumbersInLL.Node expectedOutput =additionOfTwoNumbersInLL.createLinkedList(array3);

        while(result!=null ){
            Assert.assertEquals(expectedOutput.getData(), result.getData());
            expectedOutput = expectedOutput.getNextNode();
            result = result.getNextNode();
        }


    }
}
