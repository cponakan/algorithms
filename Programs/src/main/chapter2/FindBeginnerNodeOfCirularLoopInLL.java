package main.chapter2;

/**
 * Given a circular linked list, implement an algorithm which returns node at the beginning of the loop
 */
public class FindBeginnerNodeOfCirularLoopInLL {
    Node nthNode = null;

    public Node createCircularLinkedList(int[] array, int nthNodeIndex){
        Node first = new Node(array[0]);
        Node node = first;
        for (int i=1; i<array.length; i++){
            node.setNextNode(array[i]);
            if(i == nthNodeIndex){
                nthNode = node.next;
            }
            node = node.getNextNode();
        }
        node.next = nthNode;
        return first;
    }

    public Node getNthNode(){
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

    public Node findBeginningOfLoop(Node n){
        Node n1 = n;
        Node n2 = n;
        while(n2 != null && n2.next != null){
            n1 = n1.next;
            n2 = n2.next.next;
            //meeting point
            if(n1== n2){
                break;
            }
        }

        //no circular linked list.
        if(n2 == null || n2.next == null){
            return null;
        }


        // advance n1 to start point and n2 let it be at meeting point.. now advance them at same phase..
        n1 = n;
        while(n1!= n2){
            n1 = n1.next;
            n2 = n2.next;
        }


        return n1;
    }
}
