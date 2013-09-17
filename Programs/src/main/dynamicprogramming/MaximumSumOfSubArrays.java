package main.dynamicprogramming;

/**
 *  A sub-array has one number of some continuous numbers. Given an integer array
 *  with positive numbers and negative numbers, get the maximum sum of all sub-arrays. Time complexity should be O(n).
 */
public class MaximumSumOfSubArrays {

    public static void main(String[] args){
        int[] array = {1,2,3,4,-9,6,7,-8,1,9};
        sumIndexes object = new sumIndexes();
        System.out.println(getMaximumSumOfArray(array, object));
        System.out.println(object.start);
        System.out.println(object.end);
    }

    public static int getMaximumSumOfArray(int[] array, sumIndexes object){
        int max = Integer.MIN_VALUE;
        int currentMax = 0;
        int temp=0;
        for(int i = 0; i < array.length; i++ ) {
            currentMax += array[i];
            if ( currentMax > max ) {
                max = currentMax;
                object.start = temp;
                object.end = i;
            }
            if( currentMax < 0 ) {
                currentMax = 0;
                temp = i + 1;
            }
        }

        return max;
    }

    public static class sumIndexes{
        public int start;
        public int end;
    }
}
