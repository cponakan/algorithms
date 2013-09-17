package main.Lafore.chapter3;

/**
 * Number of comparisons  is O(n2)..for sortd it takes O(n)..unsorted O(n2)
 */
public class BubbleSort {

    public static void main(String[] args){
        int[] array = {1,2,3,4,5,6};
        boolean swapped = true;
        for(int i =0; swapped && (i< array.length-1); i++){
            swapped = false;
            for(int j=0; j< array.length-i-1; j++){
                if(array[j]>array[j+1]){
                    swapped = true;
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }

        for(int i =0; i< array.length; i++){
            System.out.print(array[i] + " ");
        }

    }
}
