package main.chapter3;

/**
 * Created with IntelliJ IDEA.
 * User: cponakan
 * Date: 7/22/13
 * Time: 1:25 PM
 * To change this template use File | Settings | File Templates.
 */
public class Node{
    public Node next;
    public Node previous;
    int data;

    public Node(int data){
        this.data = data;
    }

    public int getData(){
        return data;
    }
}