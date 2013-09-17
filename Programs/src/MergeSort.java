/**
 * Merge Sort
 */
public class MergeSort {

    public static void main(String[] args){
        int[] array = {1,4,2,9,0,2,7,9,3,6};
      //  int[] sortedArray = sort(array);
      //  System.out.println("Array sorted is: " + sortedArray[0]);
    }

    private static int[] sort(int[] array, int low, int high) {
        if(array.length <=1){
            return array;
        }
        int mid = array.length/2;
      //  int[] array1 = sort(array,)

        return new int[0];  //To change body of created methods use File | Settings | File Templates.
    }

    /**
     * Always the length of first array is greater or equal to length of second array
     */
    private static int[] mergesort(int[] array1, int[] array2) throws Exception {
        int[] sortedArray = new int[array1.length + array2.length];
        if(array1.length < array2.length){
             throw new IllegalAccessException("Length of first array is less than second array");
        }
        int k =0 , j=0;
        for (int i =0; i< array1.length;){
            if(array1[i] < array2[j]){
                sortedArray[k++] = array1[i++];
            }
            else{
                sortedArray[k++] = array2[j++];
            }
        }

        for (; j <array2.length;j++){
            sortedArray[k++] = array2[j++];
        }
        return sortedArray;
    }
}
