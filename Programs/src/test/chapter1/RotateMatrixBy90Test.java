package test.chapter1;

import junit.framework.Assert;
import main.chapter1.RotateMatrixBy90;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: cponakan
 * Date: 6/28/13
 * Time: 11:26 AM
 * To change this template use File | Settings | File Templates.
 */
public class RotateMatrixBy90Test {
    RotateMatrixBy90 rotateMatrixBy90 = new RotateMatrixBy90();

    @Test
    public void testRotateMatrix() throws Exception {
       int[][] inputmatrix = {{1,2},{3,4}};
       int[][] matrix = rotateMatrixBy90.rotateMatrix(inputmatrix, 2);
       int[][] outputmatrix ={{3,1}, {4,2}};
        Assert.assertEquals(inputmatrix, matrix);
    }

    @Test
    public void testRotateMatrixDimension3() throws Exception {
        int[][] inputmatrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrix = rotateMatrixBy90.rotateMatrix(inputmatrix, 3);
        int[][] outputmatrix ={{7,4,1}, {8,5,1},{9,6,3}};
        Assert.assertEquals(inputmatrix, matrix);
    }

    @Test
    public void testRotateMatrixDimension4() throws Exception {
        int[][] inputmatrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int[][] matrix = rotateMatrixBy90.rotateMatrix(inputmatrix, 4);
        int[][] outputmatrix ={{13,9,5,1}, {14,10,6,2},{15,11,7,3},{16,12,8,4}};
        Assert.assertEquals(inputmatrix, matrix);
    }
}
