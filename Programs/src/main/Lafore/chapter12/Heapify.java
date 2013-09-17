package main.Lafore.chapter12;

import main.Node;

/**
 * Convert an arrat into heap using recursive approach
 */
public class Heapify {
    Node[] array;
    private int currentSize;


    public Heapify(int size){
        array = new Node[size];
        currentSize = 0;
    }

    public void heapify(int index){
        if(index > array.length/2 -1){
            return;
        }
        heapify(2*index+2);
        heapify(2*index+1);
        moveDown(index);
    }

    public void nonrecursive(int index){
        for(int j=array.length/2-1; j>=0; j--)
            moveDown(j);
    }

    public Node[] sortArray(){
        Node[] sortedArray = new Node[currentSize];
        int i =0;
         for(int j=currentSize-1; j>=0; j--) {//
            Node biggestNode = remove();
             sortedArray[i++] = biggestNode;
        }
        return sortedArray;
    }

    public boolean insertAt(int i){
        if(currentSize == array.length){
            return false;
        }
        Node n = new Node(i);
        array[currentSize++] = n;
        return true;
    }


    public Node remove(){
        Node node = array[0];
        array[0] = array[--currentSize];
        moveDown(0);
        return node;

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
