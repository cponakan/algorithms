package main.chapter3;

import java.util.Stack;

/**
 * Implement a MyQueue class which implements a queue using two stacks
 */
public class QueueUsingTwoStacks {
    Stack<Integer> stack = new Stack<Integer>();
    Stack<Integer> queue = new Stack<Integer>();

    public void enQueue(int value){
       stack.push(value);
    }

    public int deQueue() throws Exception {
        if(queue.isEmpty()){
            if(stack.isEmpty()){
                throw new Exception("queue is emoty!!");
            }
            while(!stack.isEmpty()){
                queue.push(stack.pop());
            }
        }
        return queue.pop();

    }
}
