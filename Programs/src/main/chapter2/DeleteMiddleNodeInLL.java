package main.chapter2;

/**
 * Implement an algorithm to delete a node in the middle of a single linked list, given only access to that node
 */
public class DeleteMiddleNodeInLL {

    public Node createLinkedList(int[] array){
        Node first = new Node(array[0]);
        Node node = first;
        for (int i=1; i<array.length; i++){
            node.setNextNode(array[i]);
            node = node.getNextNode();
        }
        return first;
    }

    public boolean deleteNode(Node middleNode){
        if(middleNode == null || middleNode.next == null){
            return false;
        }
        middleNode.data = middleNode.next.data;
        middleNode.next = middleNode.next.next;
        return true;
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
