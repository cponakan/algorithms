package main.dynamicprogramming;

/**
 * Given an unsorted array, find the max length of subsequence in which the numbers are in incremental order.
 */
public class IncrementalSubsequence {

    public static void main(String[] args){
        int[] array = {7, 2, 3, 1, 5, 8, 9, 6};
        sumIndexes object = new sumIndexes();
//        System.out.println(getMaxLength(array, object));
//        System.out.println(object.start);
        System.out.println(toHex(154));



    }

    public static String toHex ( int c ) {
        String s = Integer.toHexString ( c );
        return ( s.length() == 1 ) ? "0" + s : s;
    }

    static  int getMaxLength(int[] array, sumIndexes object){
        int max = 0;
        int temp = 0;
        int previous = array[0];
        for(int i=1; i< array.length; i++){
            if(previous < array[i]){
                max += array[i];
                object.end = i;
            }




        }



        return 0;
    }

    public static class sumIndexes{
        public int start;
        public int end;
    }


}
