package main.chapter8;

/**
 * Created with IntelliJ IDEA.
 * User: cponakan
 * Date: 7/25/13
 * Time: 10:32 AM
 * To change this template use File | Settings | File Templates.
 */
public class Fibonacci {
    public static void main(String[] args){

        int n = 8;
        int sum = 0;
        if(n == 1 || n == 2){
            sum =1;
        }else{
            int fib1 = 1;
            int fib2 = 1;
            for (int i=3; i<=n;i++){
                sum = fib1 + fib2;
                fib1= fib2;
                fib2= sum;
            }

        }

        System.out.print(sum);

    }
}

