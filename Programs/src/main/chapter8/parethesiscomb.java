package main.chapter8;

/**
 * Implement an algorithm to print all valid (e g , properly opened and closed) combi- nations of n-pairs of parentheses
 */
public class parethesiscomb {
    public static void main(String[] args){
        recursive(3, 3, "");
    }

    private static void recursive(int i, int j, String result){
        if(i<0 || j < 0 || i> j){
            return;
        }
        if(i==0 && j==0){
            System.out.println(result);
        }else{
            recursive(i-1, j, result + "{");
            recursive(i, j-1, result + "}");
        }
    }
}
