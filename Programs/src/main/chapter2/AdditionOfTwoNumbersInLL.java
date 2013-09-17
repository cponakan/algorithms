package main.chapter2;

/**
 * You have two numbers represented by a linked list, where each node contains a sin- gle digit
 * The digits are stored in reverse order, such that the 1’s digit is at the head of the list
 * Write a function that adds the two numbers and returns the sum as a linked list
 */
public class AdditionOfTwoNumbersInLL {
    public Node createLinkedList(int[] array){
        Node first = new Node(array[0]);
        Node node = first;
        for (int i=1; i<array.length; i++){
            node.setNextNode(array[i]);
            node = node.getNextNode();
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

    public Node add(Node n1, Node n2){
        Node result = null;
        Node tailNode = null;
        int carry = 0;
        while(n1 != null && n2!= null){
            int data = (n1.data + n2.data + carry )%10;
            carry = (n1.data + n2.data + carry )/10;
            Node n = new Node(data);
            n1 = n1.next;
            n2 = n2.next;
            if(result == null){
                result = n;
                tailNode = n;
            }else{
                tailNode.next = n;
                tailNode = n;
            }
        }
        while(n1 != null){
            int data = (n1.data + carry )%10;
            carry = (n1.data + carry )/10;
            n1 = n1.next;
            Node n = new Node(data);
            if(result == null){
                result = n;
                tailNode = n;
            }else{
                tailNode.next = n;
                tailNode = n;
            }
        }

        while(n2!= null){
            int data = (n2.data + carry )%10;
            carry = (n2.data + carry ) /10;
            n2 = n2.next;

            Node n = new Node(data);
            if(result == null){
                result = n;
                tailNode = n;
            }else{
                tailNode.next = n;
                tailNode = n;
            }
        }


        return result;
    }
}
