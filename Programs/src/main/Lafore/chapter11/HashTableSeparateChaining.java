package main.Lafore.chapter11;

/**
 * Created with IntelliJ IDEA.
 * User: cponakan
 * Date: 7/20/13
 * Time: 3:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class HashTableSeparateChaining {

    private SortedListDataItem[] array;
    private LinkDataItem nonItem;

    public HashTableSeparateChaining(int size){
        int sizeAllocated = getSize(size);
        array = new SortedListDataItem[sizeAllocated];
        nonItem = new LinkDataItem(-1);
        for(int j=0; j<sizeAllocated; j++) {// fill array
            array[j] = new SortedListDataItem(); // with lists
        }
    }

    public int getSize(int size){
        for (int i= size; ; i++){
            if(isPrime(i)){
                return i;
            }
        }
    }

    public boolean isPrime(int n){
        for(int i =2; i<=n/2; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

    public void insert(LinkDataItem dataItem){
        int key = dataItem.getKey();
        int hashVal = hashFunc(key); // hash the key
        array[hashVal].insert(dataItem); // insert at hashVal

    }

    public void delete(int key){
        int hashVal = hashFunc(key); // hash the key
        array[hashVal].remove(key); // insert at hashVal
    }

    public LinkDataItem find(int key){
        int hashVal = hashFunc(key); // hash the key
        return array[hashVal].find(key); // insert at hashVal
    }

    public int hashFunc(int key) {
        return key % array.length; // hash function
    }
}
