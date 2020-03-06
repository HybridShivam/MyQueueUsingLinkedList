/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 19-Feb-20
 *  Time: 2:38 AM
 */
package myqueue;

import node.Node;

public class MyQueue {
    // a field to refer rear end of queue
    private Node rear;
    // a field to refer front end of queue
    private Node front;
    private int size;// total number of elements in the queue

    // constructor
    public MyQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    // a method to check whether queue is empty
    public boolean isEmpty() {
        boolean response = false;
        if (size == 0) {
            response = true;
        }
        return response;
    }


    // a method to add a new element in queue
    public void enqueue(int element) {
        Node node = new Node(element);
        if (front == null) {
            rear = node;
            front = node;
            size++;
        } else {
            rear.setNext(node);
            rear = node;
            size++;
        }
    }

    // a method to remove element of queue from front
    public Node dequeue() {
        Node response = null;
        if (front != null) {
            if (front.getNext() != null) {
                response = new Node(front.getData());
                front = front.getNext();
                size--;
            } else {
                response = new Node(front.getData());
                front = null;
                rear = null;
                size--;
            }
        }
        return response;
    }

    // a method to get front element without removing it
    public Node peek() {
        Node response = null;
        if (!isEmpty()) {
            response = new Node(front.getData());
        }
        return response;
    }

    // a method to get size of queue
    public int getSize() {
        return size;
    }
}
