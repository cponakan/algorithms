package test.chapter1;

import junit.framework.Assert;
import main.chapter1.ElementZeroReplaceRowAndColumn;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: cponakan
 * Date: 7/1/13
 * Time: 10:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class ElementZeroReplaceRowAndColumnTest {
    ElementZeroReplaceRowAndColumn elementZeroReplaceRowAndColumn = new ElementZeroReplaceRowAndColumn();

    @Test
    public void testReplaceRowAndColumnWithZero() throws Exception {
        int[][] inputmatrix = {{1,0},{3,4}};
        int[][] matrix = elementZeroReplaceRowAndColumn.replaceRowAndColumnWithZero(inputmatrix);
        int[][] outputmatrix ={{0,0}, {0,4}};
        Assert.assertEquals(inputmatrix, matrix);
    }

    @Test
    public void testReplaceRowAndColumnWithZeroDimention3() throws Exception {
        int[][] inputmatrix = {{1,2,0},{4,5,6},{7,8,9}};
        int[][] matrix = elementZeroReplaceRowAndColumn.replaceRowAndColumnWithZero(inputmatrix);
        int[][] outputmatrix ={{0,0,0},{4,5,0},{7,8,0}};
        Assert.assertEquals(inputmatrix, matrix);
    }
}
