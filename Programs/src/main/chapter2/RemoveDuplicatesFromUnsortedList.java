package main.chapter2;

import java.util.HashSet;
import java.util.Set;

/**
 * Write code to remove duplicates from an unsorted linked list FOLLOW UP.
 * How would you solve this problem if a temporary buffer is not allowed?
 */
public class RemoveDuplicatesFromUnsortedList {

    public Node createLinkedList(int[] array){
        Node first = new Node(array[0]);
        Node node = first;
        for (int i=1; i<array.length; i++){
            node.setNextNode(array[i]);
            node = node.getNextNode();
        }
        return first;
    }

    public Node removeDuplicates(Node first){
        Node node = first;
        Set<Integer> set = new HashSet<Integer>();
        while(node.next != null){
            if(set.contains(node.next.getData())){
                node.next = node.next.next;
            }
            else{
                set.add(node.next.getData());
                node = node.next;
            }
        }
        return first;
    }

    public Node removeDuplicatesWithoutBuffer(Node first){
        Node previous = first;
        Node current = previous.next;
        while(current!=null){
            Node runner = first;
            while(current!=runner){
                if(runner.data == current.data){
                    Node tmp = current.next;
                    previous.next = tmp;
                    current = tmp;
                    break;
                }
                runner = runner.next;
            }
            if(current == runner){
                previous = current;
                current = current.next;
            }
        }

        return first;
    }

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

        public Node getNextNode(){
            return next;
        }

        public int getData(){
            return data;
        }
    }


}
