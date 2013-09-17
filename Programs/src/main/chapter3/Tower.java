package main.chapter3;

import java.util.Stack;

/**
 * In the classic problem of the Towers of Hanoi, you have 3 rods and N disks of different sizeswhichcanslideontoanytower
 * Thepuzzlestartswithdiskssortedinascending order of size from top to bottom (e g , each disk sits on top of an even larger one)
 * You have the following constraints:
 * (A) Only one disk can be moved at a time
 * (B) A disk is slid off the top of one rod onto the next rod
 * (C) A disk can only be placed on top of a larger disk
 * Write a program to move the disks from the first rod to the last using Stacks
 * Write a program to move the disks from the first rod to the last using Stacks
 */
public class Tower {
    Stack<Integer> stack;
    int index;

    public Tower(int index){
        stack = new Stack<Integer>();
        this.index = index;
    }

    public int index(){
        return this.index;
    }

    public void add(int val){
        if (!stack.isEmpty() && stack.peek() <= val) {
            System.out.println("Error placing disk: " + val);
        }
        else {
            stack.push(val);
        }
    }

    public void moveTopTo(Tower t){
        int val = stack.pop();
        t.add(val);
        System.out.println("Move disk " +  + val +  " from " + index() + " to "  + t.index());
    }

    public void moveDisks(int n, Tower destination, Tower buffer){
        if (n > 0) {
            moveDisks(n - 1, buffer, destination);
            moveTopTo(destination);
            buffer.moveDisks(n - 1, destination, this);
        }

    }

    public int remove(){
        return stack.pop();
    }

    //    public void moveDisks(char source, char intermediate, char destination, int n){
//        if(n==1){
//            System.out.print("Move Disk 1 from source: " + source + " to destination: "+ destination);
//        }else{
//            moveDisks(source, destination, intermediate, n-1);
//            System.out.print("Move Disk " + n + " from source: " + source + " to destination: "+ destination);
//            moveDisks(intermediate, source, destination, n-1);
//        }
//    }
}
