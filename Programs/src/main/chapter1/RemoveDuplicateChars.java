package main.chapter1;

/**
 * Design an algorithm and write code to remove the duplicate characters in a string without using any additional buffer
 * NOTE: One or two additional variables are fine An extra copy of the array is not FOLLOW UP
 * Write the test cases for this method
 */
public class RemoveDuplicateChars {

    //Using constant space
    public char[] removeDuplicates(char[] s){
        if(s == null){
            return null;
        }
        boolean[] array = new boolean[256];
        int tail =1;
        array[s[0]] = true;
        for(int i =1; i< s.length; i++){
            if(!array[s[i]]){
                s[tail] = s[i];
                tail++;
                array[s[i]] = true;
            }

        }
        for(int i =tail; i< s.length; i++){
            s[i] = ' ';
        }
        return s;
    }
}
