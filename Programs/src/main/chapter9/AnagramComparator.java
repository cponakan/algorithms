package main.chapter9;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 * User: cponakan
 * Date: 7/25/13
 * Time: 4:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class AnagramComparator {

    public static void main(String[] args){
        String[] array = {"abc", "def", "cba", "lkj", "rfd"};
        Arrays.sort(array, new comparator());
        for(String t :array){
            System.out.println(t);
        }
    }

    private static class comparator implements Comparator<String> {
        public String sortChars(String s) {
            char[] content = s.toCharArray();
            Arrays.sort(content);
            return new String(content);
        }


        public int compare(String s1, String s2) {
            return sortChars(s1).compareTo(sortChars(s2));
        }
    }
}



