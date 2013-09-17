package main.chapter2;

/**
 * Implement an algorithm to find the nth to last element of a singly linked list
 */
public class FindNthToLastElementInLinkedList {
    public Node createLinkedList(int[] array){
        Node first = new Node(array[0]);
        Node node = first;
        for (int i=1; i<array.length; i++){
            node.setNextNode(array[i]);
            node = node.getNextNode();
        }
        return first;
    }

    public Node findNthToLastElement(Node first, int n){
        Node node = first;
        while(n>1 && node.next!=null){
            node = node.next;
            n--;
        }
        Node nthNode = first;
        while(node.next!=null){
            nthNode = nthNode.next;
            node = node.next;
        }

        return nthNode;
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
