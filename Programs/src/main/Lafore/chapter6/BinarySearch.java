package main.Lafore.chapter6;

/**
 * Created with IntelliJ IDEA.
 * User: cponakan
 * Date: 7/25/13
 * Time: 10:12 AM
 * To change this template use File | Settings | File Templates.
 */
public class BinarySearch {
    static int[] array = {1,2,3,4,5,6,7,8};
    public static void main(String[] args){
        System.out.print(search(5,0, array.length-1));
    }

    private static int search(int element, int low, int high){
        if(low > high){
            return -1;
        }
        int mid = (low+high)/2;
        if(element < array[mid]){
              return search(element, low, mid-1);
        }else if(element > array[mid]){
              return search(element, mid+1, high);
        }
        return mid;


    }
}
