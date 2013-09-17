package main.chapter8;

/**
 * Created with IntelliJ IDEA.
 * User: cponakan
 * Date: 7/25/13
 * Time: 1:57 PM
 * To change this template use File | Settings | File Templates.
 */
public class paintfill {
    private static enum Color {
        RED(1), GREEN(2), BLACK(3), YELLOW(4), ORANGE(5);

        private final int value;
        private Color(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    };
    public static void main(String[] args){
        int[][] matrix = {{1,2,2,3},{0,0,0,0},{1,1,1,0},{4,5,0,0}};
        for(int i =0; i < 4; i++){
            for (int j =0; j< 4; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        fillcolor(matrix, 2, 3, matrix[2][3], 5);
        System.out.println("==========NEw matrix ==========");
        for(int i =0; i < 4; i++){
            for (int j =0; j< 4; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void fillcolor(int[][] color, int x, int y, int originalcolor, int newcolor){
        if( x < 0 || y < 0 || x >= color.length || y >= color.length){
            return;
        }
        if(color[x][y] == originalcolor){
            color[x][y] = newcolor;
            fillcolor(color, x+1, y, originalcolor, newcolor);
            fillcolor(color, x-1, y, originalcolor, newcolor);
            fillcolor(color, x, y+1, originalcolor, newcolor);
            fillcolor(color, x, y-1, originalcolor, newcolor);
        }

    }
}
