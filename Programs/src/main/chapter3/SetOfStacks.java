package main.chapter3;

import java.util.ArrayList;

/**
 * Imagine a (literal) stack of plates If the stack gets too high, it might topple Therefore, in real life,
 * we would likely start a new stack when the previous stack exceeds some threshold Implement a data structure
 * SetOfStacks that mimics this SetOf- Stacks should be composed of several stacks, and should create a new stack once
 * the previous one exceeds capacity SetOfStacks push() and SetOfStacks pop() should behave identically to a single stack
 * (that is, pop() should return the same values as it would if there were just a single stack)
 * FOLLOW UP: Implement a function popAt(int index) which performs a pop operation on a specific sub-stack
 */
public class SetOfStacks {
    ArrayList<Stack> stacks = new ArrayList<Stack>();
    int capacity = 0;

    public SetOfStacks(int capacity){
        this.capacity = capacity;
    }

    public void push(int v) {
        Stack stack = getLastStack();
        if(stack == null || stack.isAtCapacity()){
            stack = new Stack(capacity);
            stack.push(v);
            stacks.add(stack);
        }else{
            stack.push(v);
        }

    }

    public int pop() {
        Stack stack = getLastStack();
        int val = stack.pop();
        if(stack.isEmpty()){
            stacks.remove(stacks.size()-1);
        }
        return val;
    }

    public Stack getLastStack(){
        if(stacks.isEmpty()){
            return null;
        }else{
            return stacks.get(stacks.size()-1);
        }
    }

    public int popAt(int index){
        return leftShift(index, true);
    }

    private int leftShift(int index, boolean isTopElementToBeRemoved){
        Stack stack = stacks.get(index);
        int v;
        if(isTopElementToBeRemoved){
            v = stack.pop();
        }else{
            v = stack.removeBottom();
        }
        if(stack.isEmpty()){
            stacks.remove(index);
        }else if(stacks.size() > index + 1) {
            int v1 = leftShift(index + 1, false);
            stack.push(v);
        }
        return v;
    }

}
