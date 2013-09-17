package main.Lafore.chapter11;

/**
 * Demonstrates hash table with linear probing to run this program:
 */
public class HashTableLinearProbing {

    private DataItem[] array;
    private DataItem nonItem;

    public HashTableLinearProbing(int size){
        int sizeAllocated = getSize(size);
        array = new DataItem[2*sizeAllocated];     // create double the size of array for linear probing
        nonItem = new DataItem(-1);
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

    public void insert(DataItem dataItem){
        int hashValue = hashFunc(dataItem.getKey());
        while(array[hashValue]!= null){
            hashValue++;
            hashValue %= array.length;
        }
        array[hashValue] = dataItem;

    }

    public DataItem delete(int key){
       DataItem dataItem;
        int hashValue = hashFunc(key);
       while(array[hashValue]!= null && array[hashValue].getKey()!=key){
           hashValue++;
           hashValue %= array.length;
       }
        dataItem = array[hashValue];
        array[hashValue] = nonItem;
        return dataItem;
    }

    public DataItem find(int key){
        DataItem dataItem;
        int hashValue = hashFunc(key);
        while(array[hashValue]!= null && array[hashValue].getKey()!=key){
            hashValue++;
            hashValue %= array.length;
        }
        dataItem = array[hashValue];
        return dataItem;

    }

    public int hashFunc(int key) {
        return key % array.length; // hash function
    }
}
