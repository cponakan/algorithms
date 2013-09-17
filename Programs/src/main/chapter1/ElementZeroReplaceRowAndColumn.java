package main.chapter1;

/**
 * Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column is set to 0
 */
public class ElementZeroReplaceRowAndColumn {
    public int[][] replaceRowAndColumnWithZero(int[][] matrix){
        System.out.println("Input matrix: ");
        int[] row = new int[matrix.length];
        int[] column = new int[matrix[0].length];
        for (int i = 0; i<row.length ; i++){
            for (int j= 0; j <column.length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
        for (int i = 0; i<row.length ; i++){
            for (int j= 0; j <column.length; j++){
                if(matrix[i][j] == 0){
                    row[i]=1;
                    column[j]=1;
                }
            }
        }

        for (int i = 0; i<row.length; i++){
            for (int j= 0; j <column.length; j++){
                if(row[i]==1 || column[j]==1){
                    matrix[i][j]=0;
                }
            }
        }
        System.out.println("Output matrix: ");
        for (int i = 0; i<row.length ; i++){
            for (int j= 0; j <column.length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }

        return matrix;
    }
}
