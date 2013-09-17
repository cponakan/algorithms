package main.chapter1;

/**
 *   Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes, write a method to rotate the image by 90 degrees
 *   Can you do this in place?
 *
 */
public class RotateMatrixBy90 {

    public int[][] rotateMatrix(int[][] matrix, int length){
        System.out.println("Input matrix: ");
        for (int i = 0; i<length ; i++){
            for (int j= 0; j <length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
        for (int i = 0; i<length/2 ; i++){
            for (int j= i; j <length-1-i; j++){
                int temp = matrix[i][j];
                matrix[i][j] =  matrix[length-1-j][i];
                matrix[length-1-j][i] =  matrix[length-1-i][length-1-j];
                matrix[length-1-i][length-1-j] = matrix[j][length-1-i];
                matrix[j][length-1-i] = temp;
            }
        }
        System.out.println("Output matrix: ");
        for (int i = 0; i<length ; i++){
            for (int j= 0; j <length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
        return matrix;
    }
}
