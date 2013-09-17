package main.Lafore.chapter3;

/**
 * Number of comparisons is still is O(n2)..but swaps reduced to O(n)..for sortd it takes O(n)..unsorted O(n2)
 */
public class SelectionSort {
    public static void main(String[] args){
        int[] array = {12,87,45,78,34,43};
        int min;
        for(int i =0;  (i< array.length-1); i++){
            min = i;
            for(int j=i+1; j< array.length; j++){
                if(array[min]>array[j]){
                    min = j;
                }
            }
            if(i != min){
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }

        for(int i =0; i< array.length; i++){
            System.out.print(array[i] + " ");
        }

    }
}
