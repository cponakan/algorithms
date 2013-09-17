package main.chapter1;

/**
 * Assume you have a method isSubstring which checks if one word is a substring of another Given two strings, s1 and s2.
 * write code to check if s2 is a rotation of s1 using only one call to isSubstring (i e , “waterbottle” is a rotation of “erbottlewat”)
 */
public class IsRotationOfAnotherString {
    public boolean isRotationOfAnotherString(String s1, String s2){
        int length1 = s1.length();
        int length2 = s2.length();
        if((length1 == length2) && length1 >0 ){
            return isSubString(s1.concat(s1), s2);
        }
         return false;
    }

    private boolean isSubString(String s1, String s2){
        int index = s1.indexOf(s2);
        if(index == -1){
            return false;
        }
        return true;
    }
}
