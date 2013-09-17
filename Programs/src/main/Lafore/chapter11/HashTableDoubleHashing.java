package main.Lafore.chapter11;

/**
 *  demonstrates hash table with double hashing...here we will hash another time with different hash function when
 *  there is a collision
 */
public class HashTableDoubleHashing {

    private DataItem[] array;
    private DataItem nonItem;
    private int CONSTANT;

    public HashTableDoubleHashing(int size){
        int sizeAllocated = getSize(size);
        array = new DataItem[sizeAllocated];     // create double the size of array
        nonItem = new DataItem(-1);
        CONSTANT = getSize(sizeAllocated/2);
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
            hashValue = hashValue + hashFunc2(dataItem.getKey());
            hashValue %= array.length;
        }
        array[hashValue] = dataItem;

    }

    public DataItem delete(int key){
        DataItem dataItem;
        int hashValue = hashFunc(key);
        while(array[hashValue]!= null && array[hashValue].getKey()!=key){
            hashValue = hashValue + hashFunc2(key);
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
            hashValue = hashValue + hashFunc2(key);
            hashValue %= array.length;
        }
        dataItem = array[hashValue];
        return dataItem;

    }

    public int hashFunc(int key) {
        return key % array.length; // hash function
    }

    public int hashFunc2(int key) {
        return CONSTANT - key % CONSTANT; // hash function
    }
}

