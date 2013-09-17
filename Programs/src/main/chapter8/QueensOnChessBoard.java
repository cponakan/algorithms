package main.chapter8;

/**
 * Created with IntelliJ IDEA.
 * User: cponakan
 * Date: 7/25/13
 * Time: 2:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class QueensOnChessBoard {
    private static int[] columnOfARow = new int[8];
    public static void main(String[] args){
        arrangeQueens(0);
    }

    private  static void arrangeQueens(int row){
        if(row >= 8){
            for(int i =0; i< 8; i++){
                System.out.print(columnOfARow[i] + " ");
            }
            System.out.println("======================");
            return ;
        }


        for (int i =0; i< 8  ; i++){
            columnOfARow[row] = i;
            if(isValidPosition(row)){
                arrangeQueens(row+1);
            }
        }

    }

    private static boolean isValidPosition(int row){
        for(int i =0; i<row; i++) {
             int diff = Math.abs(columnOfARow[i]- columnOfARow[row]);
             if(diff == 0 || diff == row-i){
                 return false;
             }
        }
        return true;
    }
}
