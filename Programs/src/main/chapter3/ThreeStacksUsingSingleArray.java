package main.chapter3;

/**
 * Describe how you could use a single array to implement three stacks
 */
public class ThreeStacksUsingSingleArray {
    int stackSize = 5;
    int[] array = new int [stackSize * 3];
    int[] stackPointer = {0, 0, 0}; // stack pointers to track top elem

    public void push(int stackIndex, int value){
        int index = stackSize*stackIndex + stackPointer[stackIndex];
        stackPointer[stackIndex]++;
        array[index] = value;

    }

    public int pop(int stackIndex){
        int index = stackSize*stackIndex + stackPointer[stackIndex] - 1;
        if(index == -1){
            return 0;
        }
        stackPointer[stackIndex]--;
        int value = array[index];
        array[index] = 0;

        return value;
    }

    public boolean isEmpty(int stackIndex){
        return stackPointer[stackIndex] == 0;
    }
}
