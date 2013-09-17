package main.chapter3;

import main.Node;
import main.Stack;


/**
 * How would you design a stack which, in addition to push and pop, also has a function min which returns the minimum element?
 * Push, pop and min should all operate in O(1) time
 */
public class PushPopAndMinInO1Time extends Stack{
    Stack minStack;

    public PushPopAndMinInO1Time(){
        minStack = new Stack();
    }

    //Implement stack which will
    public void push(int value){
        if(value < min()){
            minStack.push(value);
        }
        super.push(value);
    }

    public Node pop(){
        Node node = peek();
        if(node == null){
            return null;
        }
        if(node.getData() == minStack.peek().getData()){
            minStack.pop();
        }
        super.pop();
        return node;
    }

    public int min() {
        if (minStack.isEmpty()) {
            return Integer.MAX_VALUE;
        } else {
            return minStack.peek().getData();
        }
    }
}