package main.general;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 * User: cponakan
 * Date: 7/25/13
 * Time: 11:01 PM
 * To change this template use File | Settings | File Templates.
 */
public class BreadthFirstSearch {
    public static void main(String[] args){
        Node root = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        root.leftNode = node2;
        root.rightNode = node3;
        node2.leftNode = node4;
        node2.rightNode = node5;
        node3.leftNode = node6;
        node3.rightNode = node7;
        traverse(root);
    }

    private static void traverse(Node node){
        if(node == null){
            return;
        }
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(node);
        while(!queue.isEmpty()){
            Node element = queue.remove();
            System.out.println(element.getData());
            if(element.leftNode != null){
                queue.add(element.leftNode);
            }
            if(element.rightNode != null){
                queue.add(element.rightNode);
            }
        }


    }

    private static class Node{
        public Node leftNode;
        public Node rightNode;
        int data;

        public Node(int data){
            this.data = data;
        }

        public int getData(){
            return data;
        }
    }
}
