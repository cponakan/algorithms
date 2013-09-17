package main.chapter1;

/**
 * Implement an algorithm to determine if a string has all unique characters What if you can not use additional data structures
 */
public class StringHasUniqueChars {
    public boolean isAllUniqueCharacters(String s){
        boolean[] charArray = new boolean[256];
        for(int i=0; i<s.length(); i++ ){
            int val = s.charAt(i);
            if(charArray[val]){
                return false;
            }
            else{
                charArray[val] = true;
            }
        }
        return true;
    }

    public boolean isAllUniqueCharsIfStringIsInAllSmallLetters(String s){
        int checker = 0;
        for (int i =0; i<s.length(); i++){
            int val = s.charAt(i) - 'a';
            if((checker & (1<<val)) >0){
               return false;
            }else{
                checker = checker | 1 <<val;
            }

        }
        return true;
    }
}
