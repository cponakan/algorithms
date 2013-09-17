package main;

/**
 * Created with IntelliJ IDEA.
 * User: cponakan
 * Date: 7/9/13
 * Time: 2:00 PM
 * To change this template use File | Settings | File Templates.
 */
public class Stack{
    Node stackNode;

    //Implement stack which will
    public void push(int value){
        Node node = new Node(value);

        if(stackNode == null){
            stackNode = node;
        }else{
            node.setNextNode(stackNode);
            stackNode = node;
        }
    }

    public Node pop(){
        Node node = stackNode;
        if(stackNode == null){
            return null;
        }
        stackNode = stackNode.getNextNode();
        return node;
    }

    public Node peek(){
        return stackNode;
    }

    public boolean isEmpty(){
        if(stackNode == null){
            return true;
        }
        return false;
    }
}
