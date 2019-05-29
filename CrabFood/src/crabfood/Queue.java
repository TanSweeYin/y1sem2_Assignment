/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crabfood;

import java.util.LinkedList;

/**
 *
 * @author Asus
 */
public class Queue<Customer> {

    private LinkedList<Customer> queue = new LinkedList<>();
    private int queueLine = 0;

    public void enqueue(Customer c) {
        queue.addLast(c);
        queueLine++;
    }

    public Customer dequeue() {
        queueLine--;
        return queue.removeFirst();
    }

    public int getQueueLine() {
        return queueLine;
    }

    public Customer getCustomerDetail(int i) {
        return queue.get(i);
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public Customer peek() {
        return queue.peekFirst();
    }

}
