package main;

/**
 * Created with IntelliJ IDEA.
 * User: cponakan
 * Date: 7/9/13
 * Time: 1:58 PM
 * To change this template use File | Settings | File Templates.
 */

public class Node{
    Node next;
    int data;

    public Node(int data){
        this.data = data;
    }

    public void setNextNode(int data){
        Node n = new Node(data);
        this.next = n;
    }

    public void setNextNode(Node n){
        this.next = n;
    }

    public Node getNextNode(){
        return next;
    }

    public int getData(){
        return data;
    }
}