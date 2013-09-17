package main.general;

/**
 * Created with IntelliJ IDEA.
 * User: cponakan
 * Date: 7/24/13
 * Time: 10:55 AM
 * To change this template use File | Settings | File Templates.
 */
public class isPrimeNumber {
    public static void main(String[] args){
        System.out.println(isPrime(19));
    }

    private static boolean isPrime(int n){
        boolean isPrime = true;
        int k =n;
        for(int i =2; i< n/2; i++){
            if(n%i == 0){
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }
}