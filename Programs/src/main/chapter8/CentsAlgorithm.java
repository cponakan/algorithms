package main.chapter8;

/**
 * Given an infinite number of quarters (25 cents), dimes (10 cents), nickels (5 cents) and pennies (1 cent),
 * write code to calculate the number of ways of representing n cents
 */
public class CentsAlgorithm {

    public static void main(String[] args){
        System.out.print(totalnoofways(10, 25));
    }

    private static int totalnoofways(int n, int denom){
        int nextdemon = 0;
        switch(denom){
            case 25:
                nextdemon = 10;
                break;
            case 10:
                nextdemon = 5;
                break;
            case 5:
                nextdemon = 1;
                break;
            case 1:
                return 1;
        }
        int ways = 0;
        for ( int i =0; i*denom <= n; i++){
            ways+=totalnoofways((n-i*denom), nextdemon);
        }
        return ways;

    }
}
