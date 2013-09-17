package main.chapter1;

/**
 * Write a method to replace all spaces in a string with ‘%20’
 */
public class ReplaceSpaces {

    public String replaceSpaces(String s){
        if(s == null){
            return null;
        }
        char[] array = s.toCharArray();
        int count = 0;
        for (int i=0; i< array.length; i++){
            if (s.charAt(i) == ' '){
               count +=1;
            }
        }
        if(count == 0){
            return s;
        }
        char[] newArray = new char[array.length + count*2];
        for (int i=0, j=0; i< array.length; i++){
            if (s.charAt(i) == ' '){
                newArray[j++] = '%';
                newArray[j++] = '2';
                newArray[j++] = '0';
            }else{
                newArray[j++] = array[i];
            }
        }
        return new String(newArray);
    }
}
