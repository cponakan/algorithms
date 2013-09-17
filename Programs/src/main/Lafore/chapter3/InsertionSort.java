package main.Lafore.chapter3;

/**
 * Number of comparisons atmost is O(n)..for sortd it takes O(n)..unsorted O(n2)
 */
public class InsertionSort {
    public static void main(String[] args){
        int[] array = {12,87,45,78,34,43};
        for(int i =1;  (i< array.length); i++){
            int temp = array[i];
            int j=i;
            for(; (j >0) && temp< array[j-1]; j--){
                array[j] = array[j-1];
            }
            array[j] = temp;

        }

        for(int i =0; i< array.length; i++){
            System.out.print(array[i] + " ");
        }

    }
}
