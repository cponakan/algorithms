package main;

/**
 * Converts string ascii to integer
 */
public class Atoi {
    public int convertStringToInteger(String s) {
        int integerValue = 0;
        boolean isNegativeNumber = false;
        int i =0;
        if(s.charAt(i) == '-'){
            i = 1;
            isNegativeNumber = true;
        }
        for (; i<s.length(); i++){
            int val = (s.charAt(i) - '0');
            integerValue = integerValue * 10 + val ;
        }
        if(isNegativeNumber){
            return integerValue*(-1);
        }
        return integerValue;
    }
}
