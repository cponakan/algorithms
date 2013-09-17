package main;

/**
 * Created with IntelliJ IDEA.
 * User: cponakan
 * Date: 8/2/13
 * Time: 1:44 PM
 * To change this template use File | Settings | File Templates.
 */
public class phonenumbers {
    static int[] digits = new int[] {2,3,4, 5, 6,7,8,9};

    static void displayphoneNumbers(int current, int numDigits) {
        if(numDigits==0)
            System.out.println(current);
        else {
             for(int i =0; i<digits.length; i++){
                 displayphoneNumbers(current*10+digits[i], numDigits-1);
             }
        }
    }

    public static void main(String[] args){
        displayphoneNumbers(0, 9);
    }
}
