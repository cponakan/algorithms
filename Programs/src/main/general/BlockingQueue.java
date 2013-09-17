package main.general;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 * User: cponakan
 * Date: 7/24/13
 * Time: 1:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class BlockingQueue<T> {

    private Queue<T> queue = new LinkedList<T>();
    private int capacity;

    public BlockingQueue(int capacity) {
        this.capacity = capacity;
    }


    public void put(T element) throws InterruptedException {
        synchronized (queue){
            while(queue.size() == capacity) {
                wait();
            }

            queue.add(element);
            notify();
        }

    }

    public synchronized T take() throws InterruptedException {
        synchronized (queue){
            System.out.println("In take: ");

            while(queue.isEmpty()) {
                wait();
            }

            T item = queue.remove();
            notify();
            return item;
        }

    }
}
