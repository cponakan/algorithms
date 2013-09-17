package main.Lafore.chapter12;

import main.Node;

/**
 * Heap is used for finding max or min value and it can be inserted in o(log n) time and also removal is same.
 */
public class Heap {
    Node[] array;
    private int currentSize;
    private int maxsize;

    public Heap(int size){
        array = new Node[size];
        currentSize = 0;
        maxsize = size;
    }

    public boolean isEmpty(){
        return currentSize==0;
    }

    public boolean insert(int i){
        if(currentSize == maxsize){
            return false;
        }
        Node n = new Node(i);
        array[currentSize] = n;
        moveUp(currentSize++);
        return true;
    }

    public Node remove(){
        Node node = array[0];
        array[0] = array[--currentSize];
        moveDown(0);
        return node;

    }

    private void moveUp(int index) {
        int parentIndex = (index-1)/2;
        while(parentIndex>=0 && array[parentIndex].getData() < array[index].getData()){
            //swap parent and this index;
            Node val = array[index];
            array[index] = array[parentIndex];
            array[parentIndex] = val;
            index = parentIndex;
            parentIndex = (index-1)/2;
        }

    }

    private void moveDown(int index) {
        Node top = array[index];
        while(index < currentSize/2){
            int leftChild = 2*index +1;
            int rightChild = leftChild + 1;
            int largerChild;
            if(rightChild < currentSize && array[leftChild].getData() < array[rightChild].getData()){
                largerChild = rightChild;
            }else{
                largerChild = leftChild;
            }
            if(top.getData() >= array[largerChild].getData()){
                 break;
            }else{
                //swap
                array[index] = array[largerChild];
                index = largerChild;
            }
        }
        array[index] = top;

    }


}
