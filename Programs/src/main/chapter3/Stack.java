package main.chapter3;

/**
 * Created with IntelliJ IDEA.
 * User: cponakan
 * Date: 7/22/13
 * Time: 1:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class Stack{
    Node topNode;
    Node firstNode;
    int capacity;
    int size = 0;

    public Stack(int capacity){
        this.capacity = capacity;
    }

    //Implement stack which will
    public void push(int value){
        Node node = new Node(value);

        if(topNode == null){
            topNode = node;
            firstNode = node;
        }else{
            node.next = topNode;
            topNode.previous = node;
            topNode = node;
        }
        size++;
    }

    public int pop(){
        if(size == 0){
            return 0;
        }
        Node node = topNode;
        topNode = topNode.next;
        size--;
        return node.getData();
    }

    public Node peek(){
        return topNode;
    }

    public int removeBottom(){
        if(size == 0){
            return 0;
        }
        Node node = firstNode;
        firstNode = firstNode.previous;
        size--;
        return node.getData();

    }

    public boolean isAtCapacity(){
        if(size == capacity){
            return true;
        }
        return false;
    }

    public boolean isEmpty(){
        if(size == 0){
            return true;
        }
        return false;
    }
}
